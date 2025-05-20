package Jurnal6.Code.Praktikum.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi HashMap untuk menyimpan data pemain
        Map<Integer, Pemain> pemainMap = new HashMap<>();
        // List untuk menyimpan pemain duplikat
        List<Pemain> duplikatList = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        // Tambahkan beberapa data pemain
        tambahPemain("18", "Yoichi Isagi", 18, "Striker", pemainMap, duplikatList);
        tambahPemain("20", "Meguru Bachira", 18, "Winger", pemainMap, duplikatList);
        tambahPemain("03", "Rensuke Kunigami", 18, "Forward", pemainMap, duplikatList);
        tambahPemain("04", "Hyoma Chigiri", 17, "Winger", pemainMap, duplikatList);
        tambahPemain("20", "Meguru Bachira", 18, "Winger", pemainMap, duplikatList); // Data duplikat
        
        // Tampilkan menu
        int pilihan = 0;
        do {
            System.out.println("\n===== Blue Lock Player Management System =====");
            System.out.println("1. Tambah Pemain");
            System.out.println("2. Lihat Semua Pemain");
            System.out.println("3. Cari Pemain berdasarkan Key");
            System.out.println("4. Lihat Pemain Duplikat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline
            
            switch (pilihan) {
                case 1:
                    System.out.println("\n-- Tambah Pemain Baru --");
                    System.out.print("Nomor Pemain: ");
                    String nomorPemain = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline
                    System.out.print("Posisi: ");
                    String posisi = scanner.nextLine();
                    
                    tambahPemain(nomorPemain, nama, umur, posisi, pemainMap, duplikatList);
                    System.out.println("Pemain berhasil ditambahkan!");
                    break;
                    
                case 2:
                    lihatSemuaPemain(pemainMap);
                    break;
                    
                case 3:
                    System.out.print("\nMasukkan key pemain: ");
                    int key = scanner.nextInt();
                    cariPemain(key, pemainMap);
                    break;
                    
                case 4:
                    lihatPemainDuplikat(duplikatList);
                    break;
                    
                case 5:
                    System.out.println("Terima kasih telah menggunakan Blue Lock Player Management System!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            
        } while (pilihan != 5);
        
        scanner.close();
    }
    
    // Method untuk menambahkan pemain ke HashMap
    private static void tambahPemain(String nomorPemain, String nama, int umur, String posisi, 
                                    Map<Integer, Pemain> pemainMap, List<Pemain> duplikatList) {
        Pemain pemain = new Pemain(nomorPemain, nama, umur, posisi);
        int key = pemain.customHashCode();
        
        // Cek apakah sudah ada pemain dengan nomor yang sama
        boolean isDuplicate = false;
        for (Pemain p : pemainMap.values()) {
            if (p.getNomorPemain().equals(nomorPemain)) {
                duplikatList.add(pemain);
                isDuplicate = true;
                System.out.println("Peringatan: Pemain dengan nomor " + nomorPemain + " sudah ada!");
                break;
            }
        }
        
        // Tambahkan ke map jika bukan duplikat atau jika memang ingin menambahkan duplikat
        pemainMap.put(key, pemain);
    }
    
    // Method untuk menampilkan semua pemain
    private static void lihatSemuaPemain(Map<Integer, Pemain> pemainMap) {
        if (pemainMap.isEmpty()) {
            System.out.println("\nBelum ada data pemain!");
            return;
        }
        
        System.out.println("\n-- Daftar Semua Pemain --");
        System.out.println("Key\t| Nomor\t| Nama\t\t| Umur\t| Posisi");
        System.out.println("------------------------------------------");
        
        for (Map.Entry<Integer, Pemain> entry : pemainMap.entrySet()) {
            Pemain p = entry.getValue();
            System.out.printf("%d\t| %s\t| %s\t| %d\t| %s%n", 
                entry.getKey(), p.getNomorPemain(), p.getNama(), p.getUmur(), p.getPosisi());
        }
    }
    
    // Method untuk mencari pemain berdasarkan key
    private static void cariPemain(int key, Map<Integer, Pemain> pemainMap) {
        Pemain pemain = pemainMap.get(key);
        if (pemain != null) {
            System.out.println("\n-- Detail Pemain --");
            System.out.println("Nomor: " + pemain.getNomorPemain());
            System.out.println("Nama: " + pemain.getNama());
            System.out.println("Umur: " + pemain.getUmur());
            System.out.println("Posisi: " + pemain.getPosisi());
        } else {
            System.out.println("Pemain dengan key " + key + " tidak ditemukan!");
        }
    }
    
    // Method untuk melihat pemain duplikat
    private static void lihatPemainDuplikat(List<Pemain> duplikatList) {
        if (duplikatList.isEmpty()) {
            System.out.println("\nTidak ada pemain duplikat!");
            return;
        }
        
        System.out.println("\n-- Daftar Pemain Duplikat --");
        System.out.println("Nomor\t| Nama\t\t| Umur\t| Posisi");
        System.out.println("----------------------------------");
        
        for (Pemain p : duplikatList) {
            System.out.printf("%s\t| %s\t| %d\t| %s%n", 
                p.getNomorPemain(), p.getNama(), p.getUmur(), p.getPosisi());
        }
    }
}