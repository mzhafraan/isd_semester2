import java.util.LinkedList;
import java.util.ListIterator;

public class ContohList {
    public static void main(String[] args) {
        // Membuat linked list
        LinkedList<String> karakter = new LinkedList<>();
        karakter.addLast("Reimu");
        karakter.add("Marisa");
        karakter.add("Sanae");

        // Membuat iterator
        ListIterator<String> iter = karakter.listIterator();

        // Pindah ke elemen pertama
        if (iter.hasNext()) {
            iter.next(); // Sekarang menunjuk "Reimu"
        }

        // Pindah ke elemen berikutnya dan ambil nilainya
        if (iter.hasNext()) {
            String nextChar = iter.next(); // Sekarang menunjuk "Marisa", nextChar = "Marisa"
            System.out.println("Karakter setelah Reimu: " + nextChar);
        }

        // Hapus elemen yang sedang ditunjuk (Marisa)
        iter.remove();

        // Print hasil akhir
        System.out.println("List setelah penghapusan:");
        for (String name : karakter) {
            System.out.println(name);
        }
        // Output: Reimu, Sanae
    }
}