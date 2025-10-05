How to create Hashset program in java//

import java.util.HashSet;

public class SimpleHashSet {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> colors = new HashSet<>();

        // Add elements to the set
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate, will be ignored

        // Print the set
        System.out.println("Colors: " + colors);

        // Check if an element exists
        System.out.println("Contains Green? " + colors.contains("Green"));

        // Remove an element
        colors.remove("Blue");

        // Print updated set
        System.out.println("Updated Colors: " + colors);
    }
}
