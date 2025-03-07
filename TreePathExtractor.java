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
                        "└── outmasterdir\n" +
                        "    ├── out\n" +
                        "    │   └── production\n" +
                        "    └── out2\n";
        String treedirect2 =
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


        paths = extractPathsFromTreeOutput2(treedirect2);
        for (String path : paths) {
            System.out.println(path);
        }

    }

    public static List<String> extractPathsFromTreeOutput(String filePath) {
        List<String> paths = new ArrayList<>();
        Stack<String> dirStack = new Stack<>();
        Map<Integer, String> depthMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String root = reader.readLine();
            if (root == null || root.trim().isEmpty()) {
                return paths;
            }

            paths.add(root.trim());
            depthMap.put(0, root.trim());

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                int depth = (line.lastIndexOf(" ") + 1) / 4;
                String cleanName = line.replaceAll("[│├──└── ]", "").trim();
                String parentPath = depthMap.get(depth - 1);
                String fullPath = parentPath + "/" + cleanName;
                paths.add(fullPath);
                depthMap.put(depth, fullPath);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return paths;
    }

    public static List<String> extractPathsFromTreeOutput2(String treeOutput) {
        List<String> paths = new ArrayList<>();
        Map<Integer, String> depthMap = new HashMap<>();

        String[] lines = treeOutput.split("\n");
        if (lines.length == 0 || lines[0].trim().isEmpty()) {
            return paths;
        }

        String root = lines[0].trim();
        paths.add(root);
        depthMap.put(0, root);

        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];
            if (line.trim().isEmpty()) {
                continue;
            }

            int depth = (line.lastIndexOf(" ") + 1) / 4;
            String cleanName = line.replaceAll("[│├──└── ]", "").trim();
            String parentPath = depthMap.get(depth - 1);
            String fullPath = parentPath + "/" + cleanName;
            paths.add(fullPath);
            depthMap.put(depth, fullPath);
        }
        return paths;
    }
}
