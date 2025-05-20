public class Main {

    public static void main(String[] args) {
        MinHeap q = new MinHeap();
        q.add(new Pojo(5, "tugas ISD"));
        q.add(new Pojo(8, "rapat UKM"));
        q.add(new Pojo(3, "kuis SBD"));

        q.remove();
    }
}