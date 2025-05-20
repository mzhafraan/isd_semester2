package Jurnal2.Praktikum;
import java.util.ArrayList;
import java.util.Collections;

public class Toko<E extends Comparable<? super E>> {
    private final ArrayList<E> list;

    public Toko() {
        list = new ArrayList<>();
    }

    public void addData(E values) {
        list.add(values);
    }

    public void display() {
        System.out.println("<==== belum tersotir ====>");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }

    public void displaySort() {
        Collections.sort(list);
        System.out.println("<==== sudah ter sortir (perbandingan nya kode di setiap alat musik) ====>");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }

    public void removeData(E entry) {
        list.remove(entry);
    }
}
