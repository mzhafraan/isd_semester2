public class Mahasiswa implements Comparable<Mahasiswa>{

    
    private String nim;
    private String nama;
    private String kelas;

    public Mahasiswa(String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    @Override
    public String toString() {
        return "Nim: " + nim + ", Nama: " + nama + ", Kelas: " + kelas;
    }

    @Override
    public int compareTo(Mahasiswa o) {
        return this.getNim().compareTo(o.getNim());
    }

    
}