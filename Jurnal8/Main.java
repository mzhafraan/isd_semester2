public class Main {
    public static void main(String[] args) {
        // AdjacencyList graph = new AdjacencyList(5);
        AdjacencyMatrix graph = new AdjacencyMatrix(5);
        
        


        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        graph.addEdge(3, 2);
        graph.addEdge(3, 4);
        graph.addEdge(4, 0);
        
        // list.addEdge(0, 1);
        // list.addEdge(1, 2);
        // list.addEdge(2, 3);
        // list.addEdge(3, 1);
        // list.addEdge(3, 2);
        // list.addEdge(3, 4);
        // list.addEdge(4, 0);

        graph.printMatrix();
        graph.printGraph();
    }
}