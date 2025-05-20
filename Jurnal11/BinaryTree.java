
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E> {

    private Node<E> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(E data) {
        Node<E> newNode = new Node<>(data);
        if (root == null) {
            root = newNode;
            return;
        }
        
        Queue<Node<E>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<E> ptr = queue.poll();

            if (ptr.getLeft() == null) {
                ptr.setLeft(newNode);
                break;
            } else {
                queue.add(ptr.getLeft());
            }

            if (ptr.getRight() == null) {
                ptr.setRight(newNode);
                break;
            } else {
                queue.add(ptr.getRight());
            }
        }
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node<E> node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            inOrder(node.getRight());
        }
    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node<E> node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node<E> node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }

    public void levelOrder() {
        if (root == null) {
            return;
        }
        Queue<Node<E>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<E> ptr = queue.poll();
            System.out.print(ptr.getData() + " ");
            if (ptr.getLeft() != null) {
                queue.add(ptr.getLeft());
            }
            if (ptr.getRight() != null) {
                queue.add(ptr.getRight());
            }
        }
        System.out.println();
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(Node<E> node) {
        if (node == null) {
            return 0;
        }

        return 1 + countNodes(node.getLeft()) + countNodes(node.getRight());
    }

    public boolean search(E val) {
        return search(root, val);
    }

    public int depth() {
        return depth(root);
    }

    private int depth(Node<E> node) {

        if (node == null){
            return 0;
        }

        int depthLeftNode = depth(node.getLeft());
        int depthRightNode = depth(node.getRight());


        return 1 + Math.max(depthLeftNode, depthRightNode);
    }

    private boolean search(Node<E> node, E val) {
        if (node == null) {
            return false;
        }
        if (node.getData().equals(val)) {
            return true;
        }
        return search(node.getLeft(), val) || search(node.getRight(), val);
    }

}
