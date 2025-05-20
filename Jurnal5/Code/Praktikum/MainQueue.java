public class MainQueue {

    public static void main(String[] args) {
        CustQueue customers = new CustQueue();

        customers.enqueue("Wonyoung");
        customers.enqueue("Leeseo");
        customers.enqueue("Yujin");

        System.out.println("Antrian Awal:");
        customers.printAll();

        System.out.printf("%s keluar dari antrian. \n", customers.dequeue());
        System.out.println();

        System.out.println("Antrian Saat ini: ");
        customers.printAll();

        System.out.printf("Dalam Antrian: %d\n", customers.getJumlahCust());

        System.out.printf("Jumlah yang pergi: %d\n", customers.getPergi());

    }

}
