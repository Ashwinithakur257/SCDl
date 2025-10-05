How to ArrayList using list interface program in java//


import java.util.List;
import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {
        // Declare List using ArrayList
        List<String> names = new ArrayList<>();

        // Add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Print all elements
        System.out.println("Names: " + names);

        // Access an element
        System.out.println("First name: " + names.get(0));

        // Remove an element
        names.remove("Bob");

        // Print updated list
        System.out.println("Updated Names: " + names);
    }
}
