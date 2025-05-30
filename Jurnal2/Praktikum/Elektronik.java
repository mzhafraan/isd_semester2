package Jurnal2.Praktikum;

public class Elektronik implements Comparable<Elektronik> {
    public String kode;
    public String name;
    public String kategori;
    public Integer harga;
    public Integer stok;

    public Elektronik(String kode, String name, String kategori, Integer harga, Integer stok) {
        this.kode = kode;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "<Alat Musik Elektronik>\nKode Alat Musik " + kode + "\nNama Alat Musik " + name +  "\nKategori alat musik " + kategori + "\nHarga Alat Musik " + harga + "\nStock alat musik " + stok + "\n";
    }

    public int compareTo(Elektronik o){
        return this.getKode().compareTo(o.getKode());
    }
}
