
import baru.KelasBaru;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int bil;
        Mahasiswa mhs1;
        ArrayList<Mahasiswa> mhs2 = new ArrayList<>();
        KelasBaru kelas = new KelasBaru(245, "Joko");

        bil = 5;
        mhs1 = new Mahasiswa("1234", "Jaka", "4801");

        System.out.println(bil);
        System.out.println(mhs1);

        mhs1.setNim("123467");
        System.out.println("NIM setelah dirubah: " + mhs1);

        System.out.println("NIM dari Pak " + mhs1.getNim());
        
    }
}
