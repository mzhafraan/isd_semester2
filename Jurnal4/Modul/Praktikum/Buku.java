package Praktikum;

public class Buku {
    private String isbn;
    private String judul;
    private String kategori;
    private double hargaSewa;
    private String status;

    public Buku(String isbn, String judul, String kategori, double hargaSewa, String status) {
        this.isbn = isbn;
        this.judul = judul;
        this.kategori = kategori;
        this.hargaSewa = hargaSewa;
        this.status = status;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ISBN='" + isbn + '\'' + ", Judul='" + judul + '\'' + ", Kategori='" + kategori + '\'' + ", Harga Sewa=" + hargaSewa + ", Status='" + status + '\'';
    }
}