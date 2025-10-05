import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ExecuteProcedureJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "password");

            CallableStatement cstmt = con.prepareCall("{call GetStudent(?)}");
            cstmt.setInt(1, 1); // Assuming procedure takes 1 parameter
            boolean hasResult = cstmt.execute();

            if (hasResult) {
                var rs = cstmt.getResultSet();
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2));
                }
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
