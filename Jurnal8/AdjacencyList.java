
import java.util.LinkedList;

public class AdjacencyList {
    int n;
    LinkedList<Integer> adjListArray[];

    public AdjacencyList(int n) {
        this.n = n;
        adjListArray = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjListArray[src].add(dest);
    }

    public void printGraph() {
        System.out.println("\n<=== Output Adjency List ===>");
        for (int i = 0; i < n; i++) {
            System.out.print("Vertex " + (i + 1) + " is connected to: ");
            for (int j = 0; j < adjListArray[i].size(); j++) {
                System.out.print(adjListArray[i].get(j) + 1 + " ");
            }
            System.out.println();
        }
    }

    
}
