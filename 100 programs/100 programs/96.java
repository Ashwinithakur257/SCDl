//How to create Hashtable program in java//

import java.util.Hashtable;

public class SimpleHashtable {
    public static void main(String[] args) {
        // Create a Hashtable of Integer keys and String values
        Hashtable<Integer, String> employees = new Hashtable<>();

        // Add key-value pairs
        employees.put(1, "Alice");
        employees.put(2, "Bob");
        employees.put(3, "Charlie");

        // Print the hashtable
        System.out.println("Employees: " + employees);

        // Access a value by key
        System.out.println("Employee with ID 2: " + employees.get(2));

        // Remove a key-value pair
        employees.remove(3);

        // Print updated hashtable
        System.out.println("Updated Employees: " + employees);
    }
}
