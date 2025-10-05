import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDataJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "password");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO students (id, name) VALUES (1, 'Aashu')";
            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " row(s) inserted.");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
