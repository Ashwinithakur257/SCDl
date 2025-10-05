import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = add(a, b);
        System.out.println("Sum: " + sum);
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
