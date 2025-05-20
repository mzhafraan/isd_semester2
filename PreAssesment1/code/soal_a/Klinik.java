import java.util.LinkedList;
import java.util.Queue;

class Dokter {
    private Queue<Pasien> antrian = new LinkedList<>();

    public void ambilNomor(String nomorAntrian, String namaPasien, String namaDokter, String jenisDokter) {
        Pasien pasien = new Pasien(nomorAntrian, namaPasien, namaDokter, jenisDokter);
        antrian.add(pasien);
        System.out.println("Anda adalah pasien " + jenisDokter);
        if (antrian.size() > 1) {
            System.out.println("Anda menunggu " + (antrian.size()-1) + " orang lagi");
            System.out.println();
        }
    }

    public void panggilanKlinik() {
        if (!antrian.isEmpty()) {
            Pasien pasien = antrian.poll();
            System.out.println("Nomor " + pasien.getNomorAntrian() + " dengan nama " + pasien.getNamaPasien() + " untuk dokter " + pasien.getNamaDokter() + " , pasien " + pasien.getJenisDokter() + " silahkan ke ruang periksa" );
        }
    }
}

public class Klinik {
    public static void main(String[] args) {
        Dokter dokterUmum = new Dokter();
        Dokter dokterSpesialis = new Dokter();

        dokterUmum.ambilNomor("A001", "Rita", "dr. Budi", "Dokter Umum");
        dokterUmum.ambilNomor("A002", "Kiki", "dr. Siti", "Dokter Umum");
        dokterSpesialis.ambilNomor("B001", "Ika", "dr. Mimi", "Dokter THT");

        dokterUmum.panggilanKlinik();
        dokterUmum.panggilanKlinik();
        dokterSpesialis.panggilanKlinik();
        dokterSpesialis.ambilNomor("B002", "Fikri", "dr. Kiki", "Dokter Penyakit Dalam");
        dokterSpesialis.ambilNomor("B003", "Rezaa", "dr. Kiki", "Dokter Penyakit Dalam");
        dokterSpesialis.panggilanKlinik();
        dokterSpesialis.panggilanKlinik();
    }
}