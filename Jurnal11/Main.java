
public class Main {

    public static void main(String[] args) {
        BinaryTree<Character> tree = new BinaryTree<>();

        tree.insert('A');
        tree.insert('B');
        tree.insert('C');
        tree.insert('D');
        tree.insert('E');
        tree.insert('F');
        tree.insert('G');
        tree.insert('H');
        tree.insert('I');
        tree.insert('J');
        tree.insert('K');
        tree.insert('L');

        System.out.println("Inorder Traversal:");
        tree.inOrder();

        System.out.println("Post Order Traversal:");
        tree.postOrder();

        System.out.println("Pre Order Traversal:");
        tree.preOrder();

        System.out.println("Level Order Traversal:");
        tree.levelOrder();

        System.out.println("Total Nodes: " + tree.countNodes());

        System.out.println("Apakah huruf A ada? : " + tree.search('A'));


        System.out.println("Kedalaman Tree: " + tree.depth());

    }
}
