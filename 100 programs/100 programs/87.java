//How to create LinkedList program in java//

import java.util.LinkedList;

public class SimpleLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> cities = new LinkedList<>();

        // Add elements to the list
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");

        // Print the list
        System.out.println("Cities: " + cities);

        // Access an element
        System.out.println("First city: " + cities.getFirst());

        // Remove an element
        cities.remove("Pune");

        // Print updated list
        System.out.println("Updated Cities: " + cities);
    }
}
