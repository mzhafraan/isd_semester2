
public class Node<E> {

    private Node<E> left, right;
    private E data;

    public Node() {
        this.left = null;
        this.right = null;
        this.data = null;
    }

    public Node(E data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public E getData() {
        return this.data;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

}
