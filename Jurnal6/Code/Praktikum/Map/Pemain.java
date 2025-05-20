package Jurnal6.Code.Praktikum.Map;

public class Pemain {
    private String nomorPemain;
    private String nama;
    private int umur;
    private String posisi;

    public Pemain(String nomorPemain, String nama, int umur, String posisi) {
        this.nomorPemain = nomorPemain;
        this.nama = nama;
        this.umur = umur;
        this.posisi = posisi;
    }

    public String getNomorPemain() {
        return nomorPemain;
    }

    public void setNomorPemain(String nomorPemain) {
        this.nomorPemain = nomorPemain;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public int customHashCode() {
        int hash = 0;
        for (char c : nomorPemain.toCharArray()){
            hash = hash * 31 + c;
        }
        return Math.abs(hash);
        
    }

    @Override
    public String toString() {
        return "Pemain \nNomor Pemain:" + nomorPemain + ", Nama Pemain:\n" + nama + ", Umur Pemain:\n" + umur + ", Posisi Pemain:\n" + posisi;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pemain pemain = (Pemain) obj;
        return nomorPemain.equals(pemain.nomorPemain);
    }

    

    

}
