
import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {

    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String nama;

    public SinglyLinkedList() {
        this("linked list");
        }
       

    public SinglyLinkedList(String namaList) {
        nama = namaList;
        firstNode = lastNode = null;
    }

    public void sisipDepan(E element) {
        ListNode newNode = new ListNode<E>(element);

        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(element);
        } else { //firstNode refers to new Node
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void insertAtFront(E element) {
        ListNode<E> newNode = new ListNode<E>(element);

        if (isEmpty()) {
            firstNode = lastNode = newNode;
        } else { //firstNode refers to new Node
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void insertAtBack(E element) {
        ListNode newNode = new ListNode(element);
        if (isEmpty()) {
            firstNode = lastNode = newNode;
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(nama + " is empty");
        }

        E removedItem = lastNode.data;
        //update reference firstNode and lastNode
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> current = firstNode;

            while (current.next != lastNode) {
                current = current.next;
            }

            lastNode = current;
            current.next = null;
        }
        return removedItem;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", nama);
            return;
        }

        System.out.printf("The %s is: %n", nama);
        ListNode<E> current = firstNode;

        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
        System.out.println();

    }
}
