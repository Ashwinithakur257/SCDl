import java.util.Scanner;

public class StringWidthPadding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int width = sc.nextInt();
        char ch = sc.next().charAt(0);
        int padding = width - str.length();
        for (int i = 0; i < padding; i++) {
            System.out.print(ch);
        }
        System.out.println(str);
    }
}
