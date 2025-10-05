import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImageJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "password");

            String sql = "INSERT INTO images (id, image) VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, 1);

            File file = new File("C:\\Users\\Aashu\\Desktop\\image.jpg");
            FileInputStream fis = new FileInputStream(file);
            pstmt.setBinaryStream(2, fis, (int) file.length());

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " row(s) inserted.");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
