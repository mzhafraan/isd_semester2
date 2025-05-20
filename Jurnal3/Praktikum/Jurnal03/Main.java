package Jurnal03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList daftarResep = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Resep di Awal");
            System.out.println("2. Tambah Resep di Akhir");
            System.out.println("3. Hapus Resep dari Awal");
            System.out.println("4. Hapus Resep dari Akhir");
            System.out.println("5. Cetak Semua Resep");
            System.out.println("6. Cari Resep");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                case 2:
                    System.out.print("Nama Resep: ");
                    String nama = scanner.nextLine();
                    System.out.print("Bahan Utama: ");
                    String bahan = scanner.nextLine();
                    System.out.print("Waktu Memasak (menit): ");
                    int waktu = scanner.nextInt();
                    scanner.nextLine();
                    Resep resepBaru = new Resep(nama, bahan, waktu);

                    if (pilihan == 1) {
                        daftarResep.tambahResepAwal(resepBaru);
                    } else {
                        daftarResep.tambahResepAkhir(resepBaru);
                    }
                    break;

                case 3:
                    daftarResep.hapusResepAwal();
                    break;

                case 4:
                    daftarResep.hapusResepAkhir();
                    break;

                case 5:
                    daftarResep.cetakResep();
                    break;

                case 6:
                    System.out.print("Masukkan nama resep yang dicari: ");
                    String cariNama = scanner.nextLine();
                    daftarResep.cariResep(cariNama);
                    break;

                case 7:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
}

