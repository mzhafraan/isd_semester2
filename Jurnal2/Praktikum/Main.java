package Jurnal2.Praktikum;
// import Jurnal2.Praktikum.Elektronik;
// import Jurnal2.Praktikum.Tradisional;

public class Main {
    public static void main(String[] args) {

        Toko<Elektronik> elektronik = new Toko<>();
        Toko<Tradisional> tradisional = new Toko<>();

        Tradisional data1 = new Tradisional("1200", "Sasando", "Dipetik", 1000, 1);
        Tradisional data2 = new Tradisional("1100", "Angklung", "Digoyang", 30000,1);
        Tradisional data3 = new Tradisional("1000", "Peluit", "Digoyang", 30000,1);

        Elektronik data4 = new Elektronik("1200", "Keyboard", "Ditekan", 1000, 1);
        Elektronik data5 = new Elektronik("1100", "Piano", "Digoyang", 30000,1);
        Elektronik data6 = new Elektronik("1000", "Drum", "Digoyang", 30000,1);

        // menambahkan data ke dalam arraylist di toko
        tradisional.addData(data1);
        tradisional.addData(data2);
        tradisional.addData(data3);

        elektronik.addData(data5);
        elektronik.addData(data6);
        elektronik.addData(data4);

        // ganti value yang ada di dalam arraylist
        data1.setName("Biola Beethoven");
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
