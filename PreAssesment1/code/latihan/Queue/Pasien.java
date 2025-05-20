public class Pasien {
    private String nomorAntrian;
    private String namaPasien;
    private String namaDokter;
    private String jenisDokter;

    public Pasien(String nomorAntrian, String namaPasien, String namaDokter, String jenisDokter) {
        this.nomorAntrian = nomorAntrian;
        this.namaPasien = namaPasien;
        this.namaDokter = namaDokter;
        this.jenisDokter = jenisDokter;
    }

    public String getNomorAntrian(){
        return nomorAntrian;
    }

    public void setNomorAntrian(String nomorAntrian){
        this.nomorAntrian = nomorAntrian;
    }

    public String getNamaPasien(){
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getNamaDokter(){
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public String getJenisDokter(){
        return jenisDokter;
    }

    public void setJenisDokter(String jenisDokter) {
        this.jenisDokter = jenisDokter;
    }

    @Override
    public String toString(){
        return "Nomor Antrin: " + nomorAntrian + ", Nama Pasien: " + namaPasien + ", Nama Dokter: " + namaDokter + ", Jenis Dokter: " + jenisDokter ;
    }
}