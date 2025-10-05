import java.util.Scanner;

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

public class ThrowExceptionExample {
    public static void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or older");
        } else {
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
