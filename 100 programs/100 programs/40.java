import java.util.Scanner;

public class TrimString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String trimmed = str.trim();
        System.out.println("Trimmed String: '" + trimmed + "'");
    }
}
