import java.util.List;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("Hologram");
        graph.addVertex("Kontak tim lain");
        graph.addVertex("Properti panggung");
        graph.addVertex("Pencahayaan");
        graph.addVertex("Kostum");
        graph.addVertex("Persiapan panggung");
        graph.addVertex("Pembuatan panggung");
        graph.addVertex("Pengepasan kostum");

        graph.addEdge("Hologram", "Kostum");
        graph.addEdge("Kontak tim lain", "Pengepasan kostum");
        graph.addEdge("Kontak tim lain", "Persiapan panggung");
        graph.addEdge("Properti panggung", "Kostum");
        graph.addEdge("Properti panggung", "Persiapan panggung");
        graph.addEdge("Persiapan panggung", "Pembuatan panggung");
        graph.addEdge("Kostum", "Pencahayaan");
        graph.addEdge("Kostum", "Pembuatan panggung");
        graph.addEdge("Kostum", "Pengepasan kostum");

        List<String> sortedList = graph.topologicalSort();
        if (sortedList != null) {
            System.out.println("Topological Sort: " + sortedList);
        } else {
            System.out.println("Cycle detected in the graph.");
        }
    }
}
