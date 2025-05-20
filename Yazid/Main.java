public class Main {
    public static void main(String[] args) {

        Toko<AlatMusicTradisional> tradisional = new Toko<>();
        Toko<AlatMusicElektronik> elektronik = new Toko<>();

        AlatMusicTradisional data1 = new AlatMusicTradisional("1200", "Gamelan", "Dipentung", 1000, 1);
        AlatMusicTradisional data2 = new AlatMusicTradisional("1100", "Angklung", "Digoyang", 30000,1);
        AlatMusicTradisional data3 = new AlatMusicTradisional("1000", "Peluit", "Digoyang", 30000,1);

        AlatMusicElektronik data4 = new AlatMusicElektronik("1200", "Gitar", "Dipentung", 1000, 1);
        AlatMusicElektronik data5 = new AlatMusicElektronik("1100", "Piano", "Digoyang", 30000,1);
        AlatMusicElektronik data6 = new AlatMusicElektronik("1000", "Drum", "Digoyang", 30000,1);

        // menambahkan data ke dalam arraylist di toko
        tradisional.addData(data1);
        tradisional.addData(data2);
        tradisional.addData(data3);

        elektronik.addData(data5);
        elektronik.addData(data6);
        elektronik.addData(data4);

        // ganti value yang ada di dalam arraylist
        data1.setName("Logitech g102");
        data2.setStok(2);

        // ambil salah satu data di arraylist
        System.out.println(data1.getKode());
        System.out.println(data4.getKode());

        // hapus data array
        tradisional.removeData(data2);
        elektronik.removeData(data5);

        // menampilkan data seperti bisa
        tradisional.display();
        elektronik.display();

        // menampilkan dalam bentuk sort (terurut)
        tradisional.displaySort();
        elektronik.displaySort();

    }
}
