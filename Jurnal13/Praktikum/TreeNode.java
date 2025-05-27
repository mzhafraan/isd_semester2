
class TreeNode<E extends Comparable<E>> {
    private TreeNode<E> leftNode;
    private E data;
    private TreeNode<E> rightNode;

    public TreeNode(E nodeData) {
        data = nodeData;
        leftNode = rightNode = null;
    }

    public void insert(E insertValue) {
        if (insertValue.compareTo(data) < 0) {
            if (leftNode == null) {
                leftNode = new TreeNode<>(insertValue);
            } else {
                leftNode.insert(insertValue);
            }
        } else if (insertValue.compareTo(data) > 0) {
            if (rightNode == null) {
                rightNode = new TreeNode<>(insertValue);
            } else {
                rightNode.insert(insertValue);
            }
        }
    }

    public E getData() {
        return data;
    }

    public TreeNode<E> getLeftNode() {
        return leftNode;
    }

    public TreeNode<E> getRightNode() {
        return rightNode;
    }
    
}