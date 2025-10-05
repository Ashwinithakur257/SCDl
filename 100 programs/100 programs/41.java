import java.util.Scanner;

public class ToLowerCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String lower = str.toLowerCase();
        System.out.println("Lowercase String: " + lower);
    }
}
