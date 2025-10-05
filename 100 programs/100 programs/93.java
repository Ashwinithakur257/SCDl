//How to create HashMap using map interface program in java//


import java.util.Map;
import java.util.HashMap;

public class MapInterfaceExample {
    public static void main(String[] args) {
        
        Map<Integer, String> students = new HashMap<>();

       
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");

        
        System.out.println("Students: " + students);

     
        System.out.println("Student with ID 2: " + students.get(2));

        
        students.remove(3);

        System.out.println("Updated Students: " + students);
    }
}
