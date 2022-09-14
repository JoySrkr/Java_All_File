
package priorityqueue;
import java.util.PriorityQueue;
public class Priorityqueue {

    public static void main(String[] args) {
       PriorityQueue<String> pq = new PriorityQueue<String>();
       pq.add("Red");
          pq.add("Green");
          pq.add("Black");
          pq.add("Pink");
          pq.add("orange");
     System.out.println("Priority Queue: " + pq);
    System.out.println("Size of the Priority Queue: " + pq.size());
    }
    
}
