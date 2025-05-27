
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

    public void preorderTraversal() {
        preorderHelper(root);
    }

    private void preorderHelper(TreeNode<E> node) {
        if (node == null)
        return;
        System.out.printf("%s ", node.getData());
        preorderHelper(node.getLeftNode());
        preorderHelper(node.getRightNode());
    }

    public void inorderTraversal() {
        inorderHelper(root);
    }

    private void inorderHelper(TreeNode<E> node) {
        if (node == null)
        return;
        inorderHelper(node.getLeftNode());
        System.out.printf("%s ", node.getData());
        inorderHelper(node.getRightNode());
    }

    public void postorderTraversal() {
        postorderHelper(root);
    }

    private void postorderHelper(TreeNode<E> node) {
        if (node == null)
        return;
        postorderHelper(node.getLeftNode());
        postorderHelper(node.getRightNode());
        System.out.printf("%s ", node.getData());
    }

    public void searchBST(E key) {
        boolean hasil = searchBSTHelper(root, key);
        if (hasil) {
            System.out.println("Data ditemukan: " + key);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    private boolean searchBSTHelper(TreeNode<E> node, E key) {
        if (node == null)
            return false;
        if (key.equals(node.getData()))
            return true;
        if (key.compareTo(node.getData()) < 0) {
            return searchBSTHelper(node.getLeftNode(), key);
        } else {
            return searchBSTHelper(node.getRightNode(), key);
        }
    }

    public void findMin() {
        if (root == null) {
            System.out.println("tidak ada nilai minimum");
        }
        E minValue = findMinHelper(root);
        System.out.println("Nilai terkecil: " + minValue);
    }

    private E findMinHelper(TreeNode<E> node) {
        if (node.getLeftNode() == null){
             return node.getData();
        }
        return findMinHelper(node.getLeftNode());
       
    }

    public void findMax() {
        if (root == null) {
            System.out.println("tidak ada nilai minimum");
        }
        E maxValue = findMaxHelper(root);
        System.out.println("Nilai terbesar: " + maxValue);
    }

    private E findMaxHelper(TreeNode<E> node) {
        if (node.getRightNode() == null){
             return node.getData();
        }
        return findMaxHelper(node.getRightNode());
       
    }

    public void findHeight() {
        int height = findHeightHelper(root);
        System.out.println("Tinggi tree: " + height);
    }

    private int findHeightHelper(TreeNode<E> node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = findHeightHelper(node.getLeftNode());
        int rightHeight = findHeightHelper(node.getRightNode());

        return Math.max(leftHeight, rightHeight) + 1;
    }

}
