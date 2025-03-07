import java.io.*;
import java.util.*;

public class TreePathExtractor {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java TreePathExtractor <tree_output_file>");
            return;
        }

        String filePath = args[0];
        List<String> paths = extractPathsFromTreeOutput(filePath);
        for (String path : paths) {
            System.out.println(path);
        }

        String treedirect =
                "example_dir\n" +
                "├── file1.txt\n" +
                "├── outmasterdir\n" +
                "│    └── out\n" +
                "│        └── production\n" +
                "│            └── tree2path\n" +
                "│                ├── Main.class\n" +
                "│                ├── TreeParser.class\n" +
                "│                └── TreePathExtractor.class\n" +
                "├── subdir\n" +
                "│   ├── file3.txt\n" +
                "│   └── file4.txt\n" +
                "└── subdir2\n";

        paths = extractPathsFromTreeOutput2(treedirect);
        for (String path : paths) {
            System.out.println(path);
        }

    }

    public static List<String> extractPathsFromTreeOutput(String filePath) {
        List<String> paths = new ArrayList<>();
        Stack<String> dirStack = new Stack<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String root = reader.readLine();
            if (root == null || root.trim().isEmpty()) {
                return paths;
            }

            paths.add(root.trim());
            dirStack.push(root.trim());

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                int depth = (line.lastIndexOf("│") + 1) / 4;
                if (depth == 0) {
                    depth = (line.lastIndexOf("├") + 1) / 4;
                }
                if (depth == 0) {
                    depth = (line.lastIndexOf("└") + 1) / 4;
                }

                while (dirStack.size() > depth + 1) {
                    dirStack.pop();
                }

                String cleanName = line.replaceAll("[│├──└── ]", "").trim();
                String fullPath = (dirStack.size() > 0 ? dirStack.peek() + "/" : "") + cleanName;
                paths.add(fullPath);

                if (line.contains("├") || line.contains("└")) {
                    dirStack.push(fullPath);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return paths;
    }

    public static List<String> extractPathsFromTreeOutput2(String treeOutput) {
        List<String> paths = new ArrayList<>();
        Stack<String> dirStack = new Stack<>();

        String[] lines = treeOutput.split("\n");
        if (lines.length == 0 || lines[0].trim().isEmpty()) {
            return paths;
        }

        String root = lines[0].trim();
        paths.add(root);
        dirStack.push(root);

        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];
            if (line.trim().isEmpty()) {
                continue;
            }

            int depth = (line.lastIndexOf("│") + 1) / 4;
            if (depth == 0) {
                depth = (line.lastIndexOf("├") + 1) / 4;
            }
            if (depth == 0) {
                depth = (line.lastIndexOf("└") + 1) / 4;
            }

            while (dirStack.size() > depth + 1) {
                dirStack.pop();
            }

            String cleanName = line.replaceAll("[│├──└── ]", "").trim();
            String fullPath = (dirStack.size() > 0 ? dirStack.peek() + "/" : "") + cleanName;
            paths.add(fullPath);

            if (line.contains("├") || line.contains("└")) {
                dirStack.push(fullPath);
            }
        }
        return paths;
    }
}
