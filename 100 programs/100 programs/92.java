//How to create PriorityQueue program in java//

import java.util.PriorityQueue;

public class SimplePriorityQueue {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        
        System.out.println("PriorityQueue: " + numbers);

        
        System.out.println("Head element: " + numbers.peek());
        numbers.poll(); // removes the head

       
        System.out.println("Updated PriorityQueue: " + numbers);
    }
}
