import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> tumpukan = new Stack<>();

        tumpukan.push("Riri");
        tumpukan.push("Nia");
        tumpukan.push("Bibi");
        tumpukan.push("Tita");
        String ambil = tumpukan.pop();

        System.out.println(ambil);
        System.out.println(tumpukan.peek());

        String nums[] = {"one","two","three","four","five"};
        Queue<String> antrian = new LinkedList<>();
        Collection.addAll(antrian, nums);
        System.out.println(antrian);
    }
}
