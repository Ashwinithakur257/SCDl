//How to create LinkedHashSet program in java//


import java.util.LinkedHashSet;

public class SimpleLinkedHashSet {
    public static void main(String[] args) {
        // Create a LinkedHashSet of Strings
        LinkedHashSet<String> animals = new LinkedHashSet<>();

        // Add elements to the set
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Dog"); // Duplicate, will be ignored

        // Print the set
        System.out.println("Animals: " + animals);

        // Check if an element exists
        System.out.println("Contains Cat? " + animals.contains("Cat"));

        // Remove an element
        animals.remove("Elephant");

        // Print updated set
        System.out.println("Updated Animals: " + animals);
    }
}
