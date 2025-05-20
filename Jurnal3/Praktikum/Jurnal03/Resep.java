package Jurnal03;

public class Resep {
    private String namaResep;
    private String bahanUtama;
    private int waktuMemasak;

    // Constructor
    public Resep(String namaResep, String bahanUtama, int waktuMemasak) {
        this.namaResep = namaResep;
        this.bahanUtama = bahanUtama;
        this.waktuMemasak = waktuMemasak;
    }

    // Getter dan Setter
    public String getNamaResep() {
        return namaResep;
    }

    public void setNamaResep(String namaResep) {
        this.namaResep = namaResep;
    }

    public String getBahanUtama() {
        return bahanUtama;
    }

    public void setBahanUtama(String bahanUtama) {
        this.bahanUtama = bahanUtama;
    }

    public int getWaktuMemasak() {
        return waktuMemasak;
    }

    public void setWaktuMemasak(int waktuMemasak) {
        this.waktuMemasak = waktuMemasak;
    }

    // Menampilkan detail resep
    public void tampilkanResep() {
        System.out.println("Nama: " + namaResep);
        System.out.println("Bahan Utama: " + bahanUtama);
        System.out.println("Waktu Memasak: " + waktuMemasak + " menit");
    }
}

