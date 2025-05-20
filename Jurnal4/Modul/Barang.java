public class Barang {
    private String kodeBarang;   
    private String namaBarang;   
    int stok;
    
    public Barang(String kodeBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStok() {
        return stok;
    }

    @Override
    public String toString() {
        return "kodeBarang='" + kodeBarang + '\'' +
               ", namaBarang='" + namaBarang + '\'' +
               ", stok=" + stok;
    }
    
    
    
}
