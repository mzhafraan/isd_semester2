import java.util.PriorityQueue;
import java.util.Scanner;

public class Example {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    PriorityQueue<Student> pq = new PriorityQueue<Student>(5, new StudentComparator());

      Student student1 = new Student("Rainer", 3.5);
      pq.add(student1);
      
      Student student2 = new Student("Kentut", 3.7);
      pq.add(student2);
      
      Student student3 = new Student("Rainer", 3.9);
      pq.add(student3);

      System.out.println("Students served in their priority order");

      while (!pq.isEmpty()) {
         System.out.println(pq.poll().getName());
      }

 }   
}
