package Jurnal2.Modul;

public class Baju implements Comparable<Baju> {

    private String tipe;
    private String ukuran;
    private String warna;

    public Baju(String tipe, String ukuran, String warna) {
        this.tipe = tipe;
        this.ukuran = ukuran;
        this.warna = warna;
    }

    public String getTipe() {
        return tipe;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String getWarna() {
        return warna;
    }

    @Override
    public String toString() {
        return "Baju [tipe=" + tipe + ", ukuran=" + ukuran + ", warna=" + warna + "]";
    }

    @Override
    public int compareTo(Baju o) {
        return this.getTipe().compareTo(o.getTipe());
    }
}
