import Jurnal12.Praktikum.MinHeap;
import Jurnal12.Praktikum.Pojo;

public class HeapDemo {

    public static void main(String[] args) {
        MinHeap q = new MinHeap();
        q.add(new Pojo(5, "tugas ISD"));
        q.add(new Pojo(8, "rapat UKM"));
        q.add(new Pojo(3, "kuis SBD"));
        
        while (q.size() > 0) {
            System.out.println(q.remove());
        }
    }
}
