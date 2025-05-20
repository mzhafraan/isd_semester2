package Jurnal1.praktikum;

public class Tradisional {
    private String kode;
    private String nama;
    private String kategori;
    private Integer harga;
    private Integer stok;

    

    public Tradisional(String kode, String nama, String kategori, Integer harga, Integer stok) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }
    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getKategori() {
        return kategori;
    }
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    public Integer getHarga() {
        return harga;
    }
    public void setHarga(Integer harga) {
        this.harga = harga;
    }
    public Integer getStok() {
        return stok;
    }
    public void setStok(Integer stok) {
        this.stok = stok;
    }

    
}
