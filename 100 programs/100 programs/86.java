//Create ArrayList program in java//



import java.util.ArrayList;

public class SimpleArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();

       
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);


        System.out.println("First fruit: " + fruits.get(0));

        
        fruits.remove("Banana");

        System.out.println("Updated Fruits: " + fruits);
    }
}
