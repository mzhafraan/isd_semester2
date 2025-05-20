
import java.util.LinkedList;
import java.util.Queue;

public class Klinik {

    private Queue<Pasien> antrianDokterUmum = new LinkedList<>();
    private Queue<Pasien> antrianDokterSpesialis = new LinkedList<>();

    public void tambahPasien(String nomorAntrian, String namaPasien, String namaDokter, String jenisDokter) {
        Pasien pasien = new Pasien(nomorAntrian, namaPasien, namaDokter, jenisDokter);
        if (jenisDokter.equalsIgnoreCase("Umum")) {
            antrianDokterUmum.add(pasien);
        } else {
            antrianDokterSpesialis.add(pasien);
        }
        System.out.println("Pasien " + namaPasien + " Ditambahkan ke antrian " + jenisDokter + ".");
    }

    public void panggilPasien() {
        if (!antrianDokterUmum.isEmpty()) {
            Pasien pasien = antrianDokterUmum.poll();
            System.out.println("Pasien " + pasien.getNamaPasien() + " dipanggil untuk dokter umum.");
        } else if (!antrianDokterSpesialis.isEmpty()) {
            Pasien pasien = antrianDokterSpesialis.poll();
            System.out.println("Pasien " + pasien.getNamaPasien() + " dipanggil untuk dokter spesialis");
        } else {
            System.out.println("tidak ada pasien dalam antrian.");
        }

    }

    public void tampilkanAntrian() {
        System.out.println("Antrian Dokter Umum");
        for (Pasien pasien : antrianDokterUmum) {
            System.out.println(pasien);
        }

        System.out.println("Antrian Dokter Spesialis");
        for (Pasien pasien : antrianDokterSpesialis) {
            System.out.println(pasien);
        }
    }

    public void hapusAntrian() {
        antrianDokterUmum.clear();
        antrianDokterSpesialis.clear();
        System.out.println("Semua Antrian telah dihapus");
    }

    public static void main(String[] args) {
        // Klinik klinik = new Klinik();
        // Scanner scanner = new Scanner(System.in);
        // int choice;

        // do { 
        //     System.out.println("\n===Klinik Dua Pertiwi===");
        //     System.out.println("1. Tambah Pasien");
        //     System.out.println("2. Panggil Pasien");
        //     System.out.println("3. Tampilkan Antrian");
        //     System.out.println("4. Hapus Antrian");
        //     System.out.println("5. Keluar Antrian");
        //     choice = scanner.nextInt();
        //     scanner.nextLine();

        //     switch (choice) {
        //         case 1:
        //             System.out.print("Nomor Antrian (AXXX/BXXX): ");
        //             String nomorAntrian = scanner.nextLine();
        //             System.out.print("Nama Pasien: ");
        //             String namaPasien = scanner.nextLine();
        //             System.out.print("Nama Dokter: ");
        //             String namaDokter = scanner.nextLine();
        //             System.out.print("Jenis Dokter: ");
        //             String jenisDokter = scanner.nextLine();
        //             klinik.tambahPasien(nomorAntrian, namaPasien, namaDokter, jenisDokter);
        //             break;
        //         case 2:
        //             klinik.panggilPasien();
        //             break;
        //         case 3:
        //             klinik.tampilkanAntrian();
        //             break;
        //         case 4:
        //             klinik.hapusAntrian();
        //             break;
        //         case 5:
        //             System.out.println("Terimakasih Telah Menggunakan Aplikasi Kami");
        //             break;
        //         default:
        //             System.out.println("Pilihan Tidak Valid");
        //     }
            
        // } while (choice != 5);

        Klinik klinik = new Klinik();

        System.out.println("=== Klinik Dua Pertiwi ===");

        //Tambah Pasien
        klinik.tambahPasien("A001", "Budi Santoso", "Dr. Zhafran", "Umum");
        klinik.tambahPasien("B001", "Joko Widodo", "Dr. Prabowo", "Spesialis");
        klinik.tambahPasien("A002", "Didit Prabowo", "Dr. Gibran", "Umum");

        //Display Antrian
        System.out.println("\nStatus Antrian");
        klinik.tampilkanAntrian();

        //Panggil Pasien
        System.out.println("\nMemanggil Pasien");
        klinik.panggilPasien();

        //Display Update Antrian
        System.out.println("\nStatus Antrian Setelah Panggilan");

        //Panggil Pasien Lain
        System.out.println("\nMemanggil Pasien Berikutnya: ");
        klinik.panggilPasien();

        //Tambah Pasien
        klinik.tambahPasien("B002", "Ahmad Rizki", "Dr. Teddy", "Spesialis");

        //display final antrian
        System.out.println("\nStatus Antrian Final:");
        klinik.tampilkanAntrian();

        System.out.println("\nMenghapus Semua Antrian:");
        klinik.hapusAntrian();
    }
}
