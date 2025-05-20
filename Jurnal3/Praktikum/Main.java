public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Mahasiswa> linkedList = new SinglyLinkedList<>();

        linkedList.insertAtFront(new Mahasiswa("6706123456", "Yulia", "D3IF-45-01"));
        linkedList.insertAtBack(new Mahasiswa("670678901", "Riki", "D3IF-45-02"));
        linkedList.insertAtFront(new Mahasiswa("6706123458", "Tina", "D3IF45-03"));

        linkedList.print();
        linkedList.removeFromBack();
        linkedList.print();

    }
}
