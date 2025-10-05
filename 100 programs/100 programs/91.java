How to create TreeSet program in java//

import java.util.TreeSet;

public class SimpleTreeSet {
    public static void main(String[] args) {
      
        TreeSet<String> countries = new TreeSet<>();

        
        countries.add("India");
        countries.add("USA");
        countries.add("Germany");
        countries.add("India"); // Duplicate, will be ignored

        
        System.out.println("Countries: " + countries);

        System.out.println("Contains USA? " + countries.contains("USA"));

        
        countries.remove("Germany");

    
        System.out.println("Updated Countries: " + countries);
    }
}
