//How to convert string to long in java//

public class StringToLongSimple {
    public static void main(String[] args) {
        String numberString = "123456789";

        // Convert string to long
        long number = Long.parseLong(numberString);

        // Print the result
        System.out.println("Converted long: " + number);
    }
}
