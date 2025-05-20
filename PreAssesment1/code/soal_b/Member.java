public class Member {

    private String noMember;
    private String nama;
    private String alamat;
    private String tipeMember;
    private int lamaMember;

    public Member(String noMember, String nama, String alamat, String tipeMember, int lamaMember) {
        this.noMember = noMember;
        this.nama = nama;
        this.alamat = alamat;
        this.tipeMember = tipeMember;
        this.lamaMember = lamaMember;

    }

    public String getNoMember() {
        return noMember;
    }

    public void setNoMember(String noMember) {
        this.noMember = noMember;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;

    }

    public String getTipeMember() {
        return tipeMember;
    }

    public void setTipeMember(String tipeMember) {
        this.tipeMember = tipeMember;
    }

    public int getLamaMember() {
        return lamaMember;
    }

    public void setLamaMember(int lamaMember) {
        this.lamaMember = lamaMember;
    }

    @Override
    public String toString() {
        return "No Member: " + noMember + ", Nama: " + nama + ", Alamat: " + alamat + ", Tipe Member: " + tipeMember + ", Lama Member: " + lamaMember + " tahun";
    }

}
