public class Main{
    public static void main(String[] args) {
        UndoRedo<String> ur = new UndoRedo<>();

        ur.tambahData("Marisa Kirisame");
        ur.tambahData("sang");
        ur.tambahData("penyihir");
        ur.tambahData("biasa");

        System.out.println("Isi undo sekarang (dari yang paling baru dimasukkan sampai paling lama): ");

        ur.viewListUndo();
    }

}
