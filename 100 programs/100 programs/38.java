import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String oldStr = sc.nextLine();
        String newStr = sc.nextLine();
        String result = str.replace(oldStr, newStr);
        System.out.println("Updated String: " + result);
    }
}
