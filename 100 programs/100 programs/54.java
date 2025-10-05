import java.sql.Date;
import java.util.Scanner;

public class SQLDateExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date in yyyy-mm-dd format:");
        String input = sc.nextLine();
        Date sqlDate = Date.valueOf(input);
        System.out.println("SQL Date: " + sqlDate);
    }
}
