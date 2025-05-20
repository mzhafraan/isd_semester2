package Jurnal2.Modul;

public class Celana implements Comparable<Celana> {

    private String model;
    private int ukuran;
    private String warna;

    public Celana(String model, int ukuran, String warna) {
        this.model = model;
        this.ukuran = ukuran;
        this.warna = warna;
    }

    public String getModel() {
        return model;
    }

    public int getUkuran() {
        return ukuran;
    }

    public String getWarna() {
        return warna;
    }

    @Override
    public String toString() {
        return "Celana [model=" + model + ", ukuran=" + ukuran + ", warna=" + warna + "]";
    }

    @Override
    public int compareTo(Celana o) {
        return this.getModel().compareTo(o.getModel());
    }
}
