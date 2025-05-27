
public class Tree<E extends Comparable<E>> {
    private TreeNode<E> root;

    public Tree() {
        root = null;
    }

    public void insertNode(E insertValue) {
        if (root == null) {
            root = new TreeNode<>(insertValue);
        } else {
            root.insert(insertValue);
        }
    }
}
