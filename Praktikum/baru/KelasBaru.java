package baru;

public class KelasBaru {
    private Integer bil;
    private String nama;

    public KelasBaru(Integer bil, String nama){
        this.bil = bil;
        this.nama = nama;   
    }

    @Override
    public String toString() {
        return "bil: " + bil + ", nama: " + nama;
    }

    

}
