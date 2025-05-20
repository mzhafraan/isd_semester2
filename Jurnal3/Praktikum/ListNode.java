//Node bisa menerima data apapun
//Kelas Generic

public class ListNode<E>  {
    E data;
    ListNode<E> next;

    public ListNode(E data) {
        this.data = data;
        this.next = null;
    }

    public E getData( ) {
        return data;
    }
    

    

    
}
