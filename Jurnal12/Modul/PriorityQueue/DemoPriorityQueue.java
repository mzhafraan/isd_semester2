
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;


public class DemoPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> myQueue = new PriorityQueue<>();

        myQueue.add("Tita");
        myQueue.add("ELena");
        myQueue.add("Sidik");
        myQueue.add("Cuke");
        myQueue.add("Maya");

        for (String nama : myQueue) {
            System.out.print(nama + " ");
        }

        ArrayList<String> tampung = new ArrayList<>();
        Iterator<String> iterator = myQueue.iterator();

        while (iterator.hasNext()) { 
            tampung.add(myQueue.poll());
        }

        System.out.println();

        for(String data : tampung) {
            System.out.print(data + " ");
        }
    }
}
