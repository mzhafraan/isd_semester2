import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Graph {

    private Map<String, List<String>> adjlist;
    private Map<String, Integer> inDegree;

    public Graph() {
        adjlist = new HashMap<>();
        inDegree = new HashMap<>();
    }

    public void addVertex(String vertex) {
        adjlist.put(vertex, new ArrayList<>());
        inDegree.put(vertex, 0);
    }

    public void addEdge(String source, String destination) {
        adjlist.get(source).add(destination);
        inDegree.put(destination, inDegree.get(destination) + 1);
    }

    public List<String> topologicalSort() {
        List<String> sortedList = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        for (String vertex : inDegree.keySet()){
            if (inDegree.get(vertex) == 0) {
                queue.offer(vertex);
            }
        }

        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            sortedList.add(vertex);

            for (String neighbor : adjlist.get(vertex)){
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        if (sortedList.size() != adjlist.size()) {
            return null;
        }
        return sortedList;
    }
    
}
