
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class AdjacencyMatrix {
    int n;
    boolean[][] matrix;
    LinkedList<Integer> adjListArray[];

    public AdjacencyMatrix(int n) {
        this.n = n;
        matrix = new boolean[n][n];

        adjListArray = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public void addEdge(int i, int j) {
        adjListArray[i].add(j);
        matrix[i][j] = true;
    }

    public void removeEdge(int i, int j) {
        matrix[i][j] =  false;
    }

    public boolean hasEdge(int i, int j) {
        return matrix[i][j];
    }

    public void printMatrix() {
        System.out.println("\n<=== Output Adjacency Matrix ===>");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    List<Integer> outEdges(int i) {
        List<Integer> edges = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (matrix[i][j]) edges.add(j);
        }
        return edges;
    }

    List<Integer> inEdges(int i) {
        List<Integer> edges = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (matrix[j][i]) edges.add(j);
        }
        return edges;
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