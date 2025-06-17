import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * FILE 1: Titik.java
 * Kelas sederhana (POJO) untuk merepresentasikan satu titik dalam jaringan.
 * Ini adalah cara paling dasar untuk membuat graf, di mana setiap objek
 * tahu siapa saja tetangganya.
 */
class Titik {
    String nama;
    List<Titik> daftarTetangga;

    /**
     * Konstruktor.
     * Membuat objek Titik baru dengan nama tertentu dan daftar tetangga yang masih kosong.
     */
    public Titik(String nama) {
        this.nama = nama;
        this.daftarTetangga = new ArrayList<>();
    }

    /**
     * Metode untuk menambahkan koneksi ke titik lain.
     */
    public void tambahTetangga(Titik tetangga) {
        this.daftarTetangga.add(tetangga);
    }
    
    /**
     * Mengubah objek menjadi String agar mudah dibaca saat dicetak.
     */
    @Override
    public String toString() {
        return this.nama;
    }
}


/**
 * FILE 2: Main.java
 * Kelas utama untuk menjalankan program.
 * Di sinilah kita akan membangun graf dan menjalankan algoritma BFS.
 */
public class Main {

    /**
     * Titik awal program dijalankan.
     */
    public static void main(String[] args) {
        // 1. Buat objek untuk setiap titik di dalam peta
        Titik A = new Titik("A");
        Titik C = new Titik("C");
        Titik D = new Titik("D");
        Titik E = new Titik("E");
        Titik F = new Titik("F");
        Titik G = new Titik("G");
        Titik H = new Titik("H");
        Titik I = new Titik("I");
        Titik J = new Titik("J");

        // 2. Buat koneksi dua arah antar titik sesuai gambar
        // Jika A terhubung ke C, maka C juga harus terhubung ke A.
        A.tambahTetangga(C);
        
        C.tambahTetangga(A);
        C.tambahTetangga(D);
        C.tambahTetangga(E);
        
        D.tambahTetangga(C);
        D.tambahTetangga(G);
        
        E.tambahTetangga(C);
        E.tambahTetangga(F);

        F.tambahTetangga(E);
        F.tambahTetangga(I);
        F.tambahTetangga(H);
        
        G.tambahTetangga(D);
        
        H.tambahTetangga(F);
        H.tambahTetangga(J);
        
        I.tambahTetangga(F);
        
        J.tambahTetangga(H);

        // 3. Jalankan pencarian dan cetak hasilnya
        System.out.println("Menganalisis peta penyebaran virus...");
        System.out.println("------------------------------------");
        
        Titik titikAwal = A;
        Titik titikAkhir = temukanTitikTerjauh(titikAwal);
        
        System.out.println("------------------------------------");
        System.out.println("Analisis Selesai.\n");

        System.out.println("Awal penyebaran virus: titik " + titikAwal);
        System.out.println("Akhir penyebaran virus: titik " + titikAkhir);
    }

    /**
     * Metode untuk menemukan titik terjauh menggunakan algoritma BFS.
     * Metode ini menggunakan struktur data yang sudah Anda pelajari.
     *
     * @param titikAwal Objek Titik tempat pencarian dimulai.
     * @return Objek Titik yang paling jauh.
     */
    public static Titik temukanTitikTerjauh(Titik titikAwal) {
        // Gunakan LinkedList sebagai implementasi dari Queue (antrian).
        Queue<Titik> antrian = new LinkedList<>();

        // Gunakan ArrayList untuk mencatat titik yang sudah dikunjungi.
        List<Titik> sudahDikunjungi = new ArrayList<>();

        Titik titikTerakhir = null;

        // 1. Mulai BFS dari titik awal
        antrian.add(titikAwal);
        sudahDikunjungi.add(titikAwal);

        // 2. Lakukan perulangan selama antrian tidak kosong
        while (!antrian.isEmpty()) {
            // Ambil titik dari depan antrian
            Titik titikSekarang = antrian.poll();
            titikTerakhir = titikSekarang; // Simpan sebagai kandidat titik terjauh

            System.out.println("Memeriksa titik: " + titikSekarang.nama);

            // 3. Cek semua tetangga dari titik yang sedang diperiksa
            for (Titik tetangga : titikSekarang.daftarTetangga) {
                // 4. Jika tetangga ini belum pernah dikunjungi...
                if (!sudahDikunjungi.contains(tetangga)) {
                    // Tandai sebagai sudah dikunjungi
                    sudahDikunjungi.add(tetangga);
                    // Masukkan ke dalam antrian untuk diperiksa nanti
                    antrian.add(tetangga);
                }
            }
        }
        
        // 5. Setelah antrian kosong, titik terakhir yang diproses adalah yang paling jauh
        return titikTerakhir;
    }
}
