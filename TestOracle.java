import java.sql.*;

public class TestOracle {
    public static void main(String[] args) {
        try {
            String url = null;
            String user = null;
            String pass = null;
            Class.forName("oracle.jdbc.OracleDriver");
            if (args==null || args.length==0) {
                url = "jdbc:oracle:thin:@//ent-db-rac-scan.ecofis.de:1521/ent-db-rac-scan.ecofis.de";
                user = "eneadmin";
                pass = "eneadmin";
            }
            try (Connection conn = DriverManager.getConnection(url, user, pass)) {
                System.out.println("✅ Verbindung erfolgreich!");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("❌ JDBC-Treiber nicht gefunden: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("❌ Verbindung fehlgeschlagen: " + e.getMessage());
        }
    }
}
