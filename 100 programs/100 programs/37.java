import java.util.Scanner;

public class IndexOfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        int index = str.indexOf(ch);
        System.out.println("Index of '" + ch + "': " + index);
    }
}
