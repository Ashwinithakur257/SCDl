//How to create LinkedHashMap program in java//


import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleLinkedHashMap {
    public static void main(String[] args) {
        // Create a LinkedHashMap of Integer keys and String values
        Map<Integer, String> books = new LinkedHashMap<>();

        // Add key-value pairs
        books.put(101, "Java Basics");
        books.put(102, "Python Essentials");
        books.put(103, "C++ Guide");

        // Print the map
        System.out.println("Books: " + books);

        // Access a value by key
        System.out.println("Book with ID 102: " + books.get(102));

        // Remove a key-value pair
        books.remove(103);

        // Print updated map
        System.out.println("Updated Books: " + books);
    }
}
