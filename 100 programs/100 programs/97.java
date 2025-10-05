//How to create Array program in java//

public class SimpleArray {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Print all elements using a loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Access a specific element
        System.out.println("Third element: " + numbers[2]);
    }
}
