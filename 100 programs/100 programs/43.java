import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int length = str1.length();
        String concatenated = str1 + str2;
        String replaced = str1.replace('a', 'e');

        System.out.println("Length of str1: " + length);
        System.out.println("Concatenated String: " + concatenated);
        System.out.println("Replaced String: " + replaced);
    }
}
