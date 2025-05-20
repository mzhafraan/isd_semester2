import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // Membuat linked list untuk menyimpan objek Barang
        LinkedList<Barang> listBarang = new LinkedList<>();
        
        // Menambahkan barang menggunakan berbagai method
        listBarang.add(new Barang("001", "Tongkat Gohei", 10)); // Tambah di akhir
        listBarang.addLast(new Barang("002", "Bros Kodok", 20)); // Tambah di akhir
        listBarang.addFirst(new Barang("003", "Topi Penyihir", 15)); // Tambah di awal
        listBarang.add(new Barang("004", "Topi Penyihir", 15)); // Tambah di awal
        listBarang.add(new Barang("005", "Topi Penyihir", 15)); // Tambah di awal
        listBarang.add(2, new Barang("006", "Katana", 1)); // Tambah di index 2
        
        // Menampilkan daftar barang dengan iterator maju
        System.out.println("Daftar Barang:");
        ListIterator<Barang> iterator = listBarang.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Menampilkan daftar barang dengan iterator mundur
        System.out.println("\nCetak mundur list:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        
        // Menghapus barang dengan kode 005
        ListIterator<Barang> iterHapus = listBarang.listIterator();
        while (iterHapus.hasNext()) {
            Barang barang = iterHapus.next();
            if (barang.getKodeBarang().equals("006")) {
                iterHapus.remove();
            }
        }
        
        // Menampilkan daftar barang setelah penghapusan
        System.out.println("\nSesudah hapus data:");
        for (Barang item : listBarang) {
            System.out.println(item);
        }
        
        // Mengedit stok barang terakhir
        if (listBarang.size() >= 2) {

            Barang barangTerakhir = listBarang.getLast();
            System.out.println("\nMengedit data paling akhir");
            barangTerakhir.stok = 5; // Mengubah langsung atribut
        }
        
        // Menampilkan daftar barang setelah pengeditan
        System.out.println("\nSetelah edit stok:");
        for (Barang item : listBarang) {
            System.out.println(item);
        }
    }
}