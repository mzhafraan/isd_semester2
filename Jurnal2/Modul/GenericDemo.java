package Jurnal2.Modul;

import java.util.Scanner;

public class GenericDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenArrayList<Baju> bajuList = new GenArrayList<>(3);
        GenArrayList<Celana> celanaList = new GenArrayList<>(3);
        for (int i = 0; i < 2; i++) {
            System.out.println("Masukan model Celana:");
            String model = input.next();
            System.out.println("Masukan ukuran Celana:");
            int ukuran = input.nextInt();
            System.out.println("Masukan warna Celana:");
            String warna = input.next();
            celanaList.addData(new Celana(model, ukuran, warna));
        }
        celanaList.displaySort();
        for (int i = 0; i < 2; i++) {
            System.out.println("Masukan Tipe Baju:");
            String tipe = input.next();
            System.out.println("Masukan Ukuran Baju:");
            String ukuran = input.next();
            System.out.println("Masukan Warna Baju:");
            String warna = input.next();
            Baju bj = new Baju(tipe, ukuran, warna);
            bajuList.addData(bj);
        }
        bajuList.addData(new Baju("kemeja", "s", "hijau"));
        Baju bjDelete = (new Baju("kemeja", "s", "hijau"));
        bajuList.displaySort();
        bajuList.removeData(bjDelete);
        bajuList.display();
    }
}
