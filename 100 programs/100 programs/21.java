import java.util.Scanner;

public class WhileBreakExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
            i++;
        }
    }
}
