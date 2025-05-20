import java.util.ArrayList;

public class MinHeap {

    private ArrayList<Comparable> elements;

    /**
     * Constructs an empty heap.
     */
    public MinHeap() {
        elements = new ArrayList<Comparable>();
        elements.add(null);
    }

    /**
     * Returns the index of the left child.
     *
     * @param index the index of a node in this heap
     * @return the index of the left child of the given node
     */
    private static int getLeftChildIndex(int index) {
        return 2 * index;
    }

    /**
     * Returns the index of the right child.
     *
     * @param index the index of a node in this heap
     * @return the index of the right child of the given node
     */
    private static int getRightChildIndex(int index) {
        return 2 * index + 1;
    }

    /**
     * 
     *
     * @param index 
     * @return 
     */
    private static int getParentIndex(int index) {
        return index / 2;
    }

    /**
     * Adds a new element to this heap.
     *
     * @param newElement the element to add
     */
    public void add(Comparable newElement) {
        // Add a new leaf
        elements.add(null);
        int index = elements.size() - 1;
        // Demote parents that are larger than the new element
        while (index > 1 && getParent(index).compareTo(newElement) > 0) {
            elements.set(index, getParent(index));
            index = getParentIndex(index);
        }
        // Store the new element in the vacant slot
        elements.set(index, newElement);
    }

    /**
     * Gets the minimum element stored in this heap.
     *
     * @return 
     */
    public Comparable peek() {
        return elements.get(1);
    }

    /**
     * Removes the minimum element from this heap.
     *
     * @return the minimum element
     */
    public Comparable remove() {
        Comparable minimum = elements.get(1);
        // Remove last element
        int lastIndex = elements.size() - 1;
        Comparable last = elements.remove(lastIndex);
        if (lastIndex > 1) {
            elements.set(1, last);
            fixHeap();
        }
        System.out.println("Task terdekat yang harus diselesaikan: " + minimum);
        System.out.println(minimum + " Selesai dilaksanakan, berikutnya " + last);
        return minimum;
    }

    private void fixHeap() {
        Comparable root = elements.get(1);
        int lastIndex = elements.size() - 1;
        // Promote children of removed root while they are smaller than last
        int index = 1;
        boolean more = true;
        while (more) {
            int childIndex = getLeftChildIndex(index);
            if (childIndex <= lastIndex) {
                Comparable child = getLeftChild(index);
                if (getRightChildIndex(index) <= lastIndex
                        && getRightChild(index).compareTo(child) < 0) {
                    childIndex = getRightChildIndex(index);
                    child = getRightChild(index);
                }
                if (child.compareTo(root) < 0) {
                    elements.set(index, child);
                    index = childIndex;
                } else {
                    more = false;
                }
            } else {
                more = false;
            }
        }
        elements.set(index, root);
    }


    public int size() {
        return elements.size() - 1;
    }

    /**
     * Returns the value of the left child.
     *
     * @param index the index of a node in this heap
     * @return the value of the left child of the given node
     */
    private Comparable getLeftChild(int index) {
        return elements.get(2 * index);
    }

    /**
     * Returns the value of the right child.
     *
     * @param index 
     * @return 
     */
    private Comparable getRightChild(int index) {
        return elements.get(2 * index + 1);
    }

    /**
     * 
     *
     * @param index 
     * @return 
     */
    private Comparable getParent(int index) {
        return elements.get(index / 2);
    }
}