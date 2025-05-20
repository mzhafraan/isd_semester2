import java.util.PriorityQueue;
import java.util.Scanner;

public class Example {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    PriorityQueue<Student> pq = new PriorityQueue<Student>(5, new StudentComparator());
 }   
}
