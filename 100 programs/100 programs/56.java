import java.util.Random;

public class RandomNumberExample {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(100); // Generates a number between 0 and 99
        System.out.println("Random Number: " + randomNum);
    }
}
