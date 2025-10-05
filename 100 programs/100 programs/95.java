//How to create TreeMap program in java//


import java.util.Map;
import java.util.TreeMap;

public class SimpleTreeMap {
    public static void main(String[] args) {
     
        Map<Integer, String> students = new TreeMap<>();

      
        students.put(103, "Charlie");
        students.put(101, "Alice");
        students.put(102, "Bob");

        
        System.out.println("Students: " + students);


        System.out.println("Student with ID 102: " + students.get(102));

        students.remove(103);


        System.out.println("Updated Students: " + students);
    }
}
