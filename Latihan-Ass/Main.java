import java.util.*;

class CityGraph {
    private LinkedList<String> cities;
    private LinkedList<LinkedList<String>> adjacencyList;

    public CityGraph() {
        this.cities = new LinkedList<>();
        this.adjacencyList = new LinkedList<>();
    }

    public void addCity(String city) {
        if (!cities.contains(city)) {
            cities.add(city);
            adjacencyList.add(new LinkedList<>());
        }
    }

    private int getCityIndex(String city) {
        return cities.indexOf(city);
    }

    public void addConnection(String city1, String city2) {
        addCity(city1);
        addCity(city2);
        
        int index1 = getCityIndex(city1);
        int index2 = getCityIndex(city2);
        
        if (index1 != -1 && index2 != -1) {
            adjacencyList.get(index1).add(city2);
            adjacencyList.get(index2).add(city1);
        }
    }

    public LinkedList<String> getNeighbors(String city) {
        int index = getCityIndex(city);
        if (index != -1) {
            return adjacencyList.get(index);
        }
        return new LinkedList<>();
    }

    public LinkedList<String> bfsTraversal(String startCity) {
        LinkedList<String> visitedOrder = new LinkedList<>();
        LinkedList<String> queue = new LinkedList<>();
        LinkedList<String> visited = new LinkedList<>();

        if (!cities.contains(startCity)) {
            System.out.println("Kota " + startCity + " tidak ditemukan!");
            return visitedOrder;
        }

        queue.addLast(startCity);
        visited.add(startCity);

        while (!queue.isEmpty()) {
            String currentCity = queue.removeFirst();
            visitedOrder.addLast(currentCity);
            
            System.out.println("Mengunjungi: " + currentCity);

            LinkedList<String> neighbors = getNeighbors(currentCity);
            Collections.sort(neighbors);

            for (String neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.addLast(neighbor);
                }
            }
        }
        return visitedOrder;
    }

    public LinkedList<String> dfsTraversal(String startCity) {
    LinkedList<String> visitedOrder = new LinkedList<>();
    LinkedList<String> stack = new LinkedList<>();
    LinkedList<String> visited = new LinkedList<>();

    if (!cities.contains(startCity)) {
        System.out.println("Kota " + startCity + " tidak ditemukan!");
        return visitedOrder;
    }

    stack.addFirst(startCity);

    while (!stack.isEmpty()) {
        String currentCity = stack.removeFirst();
        
        if (!visited.contains(currentCity)) { // Ganti 'neighbor' dengan 'currentCity'
            visited.add(currentCity);
            visitedOrder.addLast(currentCity);
            
            System.out.println("Mengunjungi: " + currentCity);

            LinkedList<String> neighbors = getNeighbors(currentCity);
            Collections.sort(neighbors, Collections.reverseOrder());

            for (String neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    stack.addFirst(neighbor);
                }
            }
        }
    }
    return visitedOrder;
}
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI PERJALANAN DITA ===\n");
        
        CityGraph ukMap = new CityGraph();

        String[] cities = {
            "London", "Birmingham", "Salisbury", "Bristol", "Cardiff", 
            "Manchester", "Kingston", "Liverpool", "Newcastle", "Edinburgh", "Glasgow"
        };
        
        System.out.println("Menambahkan kota-kota:");
        for (String city : cities) {
            ukMap.addCity(city);
            System.out.println("- " + city);
        }

        System.out.println("\nMenambahkan jalur antar kota:");
        ukMap.addConnection("London", "Birmingham");
        ukMap.addConnection("London", "Salisbury");
        ukMap.addConnection("Salisbury", "Bristol");
        ukMap.addConnection("Bristol", "Birmingham");
        ukMap.addConnection("Birmingham", "Kingston");
        ukMap.addConnection("Birmingham", "Cardiff");
        ukMap.addConnection("Manchester", "Liverpool");
        ukMap.addConnection("Manchester", "Kingston");
        ukMap.addConnection("Manchester", "Birmingham");
        ukMap.addConnection("Manchester", "Newcastle");
        ukMap.addConnection("Manchester", "Glasgow");
        ukMap.addConnection("Kingston", "Newcastle");
        ukMap.addConnection("Newcastle", "Edinburgh");
        ukMap.addConnection("Edinburgh", "Glasgow");
        
        System.out.println("Jalur berhasil ditambahkan!\n");
        
        String startCity = "London";
        System.out.println("=====================================================");
        System.out.println("Perencanaan Perjalanan Dita");
        System.out.println("Kota Awal: " + startCity);
        System.out.println("=====================================================\n");

        System.out.println("SKENARIO A: Mengunjungi Kota Terdekat Dulu (BFS)");
        System.out.println("Strategi: Level demi level, seperti gelombang");
        System.out.println("---------------------------------------------------");
        LinkedList<String> bfsResult = ukMap.bfsTraversal(startCity);
        System.out.println("\nRute BFS:");
        printRoute(bfsResult);

        System.out.println("\nSKENARIO B: Jelajahi Sejauh Mungkin Dulu (DFS)");
        System.out.println("Strategi: Masuk dalam dulu, baru backtrack");
        System.out.println("---------------------------------------------------");
        LinkedList<String> dfsResult = ukMap.dfsTraversal(startCity);
        System.out.println("\nRute DFS:");
        printRoute(dfsResult);
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("PERBANDINGAN HASIL:");
        System.out.println("=".repeat(50));
        System.out.println("BFS: " + String.join(" -> ", bfsResult));
        System.out.println("DFS: " + String.join(" -> ", dfsResult));
        System.out.println("\nKesimpulan:");
        System.out.println("- BFS cocok untuk mencari rute terpendek");
        System.out.println("- DFS cocok untuk eksplorasi mendalam");
    }
    
    private static void printRoute(LinkedList<String> route) {
        if (route.isEmpty()) {
            System.out.println("Rute tidak dapat dibuat.");
            return;
        }
        
        System.out.print("  ");
        for (int i = 0; i < route.size(); i++) {
            System.out.print(route.get(i));
            if (i < route.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
        System.out.println("📊 Total kota dikunjungi: " + route.size());
    }
}