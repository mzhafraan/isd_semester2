import Jurnal03.Node;

public class HashSetModul {
    private node[] buckets;
    private int size;

    public HashSetModul() {
        this(10);
    }

    public HashSetModul(int bucketsLength){
        buckets = new Node[bucketsLength];
        size = 0;
    }
}