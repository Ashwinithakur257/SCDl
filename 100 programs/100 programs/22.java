import java.util.Scanner;

public class WhileBreakContinue {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                i++;
                continue;
            }
            if (i == 8) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
