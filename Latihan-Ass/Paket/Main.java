package Paket;
import java.util.ArrayList;
import java.util.List;


class SampaiAmanah implements Comparable<SampaiAmanah> {
    private int id;
    private String namaPelanggan;
    private String alamat;
    private int tanggalKirim; 

    public SampaiAmanah(int id, String namaPelanggan, int tanggalMasuk, String tipePengiriman, String alamat) {
        this.id = id;
        this.namaPelanggan = namaPelanggan;
        this.alamat = alamat;
        
        
        switch (tipePengiriman.toLowerCase()) {
            case "same day":
                this.tanggalKirim = tanggalMasuk; 
                break;
            case "kilat":
                this.tanggalKirim = tanggalMasuk + 1; 
                break;
            case "express":
                this.tanggalKirim = tanggalMasuk + 2; 
                break;
            case "biasa":
            default:
                this.tanggalKirim = tanggalMasuk + 3; 
                break;
        }
    }

    
    @Override
    public int compareTo(SampaiAmanah otherPaket) {
        return Integer.compare(this.tanggalKirim, otherPaket.tanggalKirim);
    }
    
    @Override
    public String toString() {
        return "ID Paket: " + id + 
               " namaPelanggan: " + namaPelanggan + 
               " alamat Pelanggan: " + alamat + 
               " (Target Kirim Tgl: " + tanggalKirim + ")";
    }
}



class Ekspedisi {
    private List<SampaiAmanah> daftarPaket;

    public Ekspedisi() {
        this.daftarPaket = new ArrayList<>();
        System.out.println("Sistem Ekspedisi SampaiAmanah Siap Menerima Paket!\n");
    }

    public void terimaKiriman(int id, String nama, int tglMasuk, String tipe, String alamat) {
        SampaiAmanah paketBaru = new SampaiAmanah(id, nama, tglMasuk, tipe, alamat);
        daftarPaket.add(paketBaru);
        System.out.println("-> Paket ID " + id + " (" + nama + ") diterima.");
    }
    
    
    public void cetakUrutanPengiriman() {
        System.out.println("\n========================================");
        System.out.println("Mengurutkan paket secara manual...");
        
        
        int n = daftarPaket.size(); 

        
        for (int i = 0; i < n - 1; i++) {
            
            int indexPaketPrioritas = i;

            
            
            for (int j = i + 1; j < n; j++) {
                
                
                if (daftarPaket.get(j).compareTo(daftarPaket.get(indexPaketPrioritas)) < 0) {
                    
                    indexPaketPrioritas = j;
                }
            }

            
            
            
            SampaiAmanah paketPrioritas = daftarPaket.get(indexPaketPrioritas);
            daftarPaket.set(indexPaketPrioritas, daftarPaket.get(i));
            daftarPaket.set(i, paketPrioritas);
        }
        

        System.out.println("Urutan Paket yang Harus Dikirimkan:");
        System.out.println("========================================");

        
        for (SampaiAmanah paket : daftarPaket) {
            System.out.println(paket);
        }
    }
}



public class Main {
    public static void main(String[] args) {
        
        Ekspedisi daftarPaket = new Ekspedisi();
        
        
        daftarPaket.terimaKiriman(1, "Yuli", 5, "express", "Jl. Ciganitri no. 15");
        daftarPaket.terimaKiriman(2, "Kiki", 6, "kilat", "Jl. Pogor no. 11");
        daftarPaket.terimaKiriman(3, "Toto", 7, "biasa", "Jl. Sukabirus no. 15");
        daftarPaket.terimaKiriman(4, "Juni", 8, "express", "Jl Telekomunikasi no. 2");
        daftarPaket.terimaKiriman(5, "Julia", 8, "Same day", "Jl. Ciganitri no. 13");
        daftarPaket.terimaKiriman(6, "Agus", 9, "biasa", "Jl. Ciganitri no. 23");
        
        
        daftarPaket.cetakUrutanPengiriman();
    }
}
