//How to create Multidimensional array program in java//

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Create a 2D array (3 rows, 2 columns)
        int[][] numbers = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        // Print all elements using nested loops
        System.out.println("2D Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }

        // Access a specific element
        System.out.println("Element at row 2, column 1: " + numbers[1][0]);
    }
}
