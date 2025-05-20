package Praktikum;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        // Membuat linked list untuk menyimpan objek Buku
        LinkedList<Buku> daftarBuku = new LinkedList<>();

        // Menambahkan buku menggunakan berbagai method
        daftarBuku.add(new Buku("1234-0", "Mitologi Laba-Laba Sunda", "Fiksi", 15000, "Tidak Dipinjam"));
        daftarBuku.add(new Buku("1234-1", "Bayang-bayang Raja Jawa", "Fiksi", 15000, "Tidak Dipinjam"));
        daftarBuku.addLast(new Buku("1234-2", "A Plague Tale: Requiem", "Sejarah", 20000, "Tidak Dipinjam"));
        daftarBuku.addFirst(new Buku("1234-4", "Keris Sakti: Sun Wukong", "Sejarah", 30000, "Tidak Dipinjam"));
        daftarBuku.add(new Buku("1234-3", "Pura-pura Sigma", "Sejarah", 30000, "Tidak Dipinjam"));
        daftarBuku.add(2, new Buku("1234-5", "Seni Menggoreng Cosplayer", "Masakan", 25000, "Tidak Dipinjam"));

        // Menampilkan daftar buku dengan iterator maju
        System.out.println("Daftar Buku dari Depan:");
        ListIterator<Buku> iterator = daftarBuku.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Menampilkan daftar buku dengan iterator mundur
        System.out.println("\nDaftar Buku dari Belakang:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        // Menghapus buku dengan ISBN 1234-5
        ListIterator<Buku> iterHapus = daftarBuku.listIterator();
        while (iterHapus.hasNext()) {
            Buku buku = iterHapus.next();
            if (buku.getIsbn().equals("1234-5")) {
                iterHapus.remove();
            }
        }

        // Menampilkan daftar buku setelah penghapusan
        System.out.println("\nSesudah hapus data:");
        for (Buku item : daftarBuku) {
            System.out.println(item);
        }

        if (daftarBuku.size() >= 2) {

            //Mengedit Buku paling akhir
            Buku bukuAkhir = daftarBuku.getLast();
            System.out.println("\nMengedit buku paling akhir");
            // System.out.println("Sebelum: " + bukuAkhir);
            bukuAkhir.setJudul("Takjil Pahlawan Himmel");
            bukuAkhir.setHargaSewa(25000);
            System.out.println("Sesudah: " + bukuAkhir);

            //edit buku kedua dari akhir
            Buku bukuKeduaDariBelakang = daftarBuku.get(daftarBuku.size() - 2);
          
            bukuKeduaDariBelakang.setJudul("Makan Malam Leeseo: Danau Galau");
            System.out.println("Sesudah: " + bukuKeduaDariBelakang);
        }   


        // Menampilkan daftar buku setelah pengeditan
        System.out.println("\nSetelah edit data:");
        for (Buku item : daftarBuku) {
            System.out.println(item);
        }
    }
}
