import java.util.*;


class CityGraph {
    
    private final Map<String, List<String>> adjacencyList;

    
    public CityGraph() {
        this.adjacencyList = new HashMap<>(); 
    }

    
    public void addCity(String city) {
        
        adjacencyList.putIfAbsent(city, new ArrayList<>());
    }

    
    public void addConnection(String city1, String city2) {
        
        adjacencyList.putIfAbsent(city1, new ArrayList<>());
        adjacencyList.putIfAbsent(city2, new ArrayList<>());

        
        adjacencyList.get(city1).add(city2);  
        adjacencyList.get(city2).add(city1);  
    }
    
    
    public List<String> getNeighbors(String city) {
        
        return adjacencyList.getOrDefault(city, Collections.emptyList());
    }

    
    public List<String> bfsTraversal(String startCity) {
        
        List<String> visitedOrder = new ArrayList<>();
        
        
        Queue<String> queue = new LinkedList<>();
        
        
        Set<String> visited = new HashSet<>();

        
        if (!adjacencyList.containsKey(startCity)) {
            System.out.println("Kota " + startCity + " tidak ditemukan!");
            return visitedOrder;
        }

        
        queue.add(startCity);           
        visited.add(startCity);         

        
        while (!queue.isEmpty()) {
            
            String currentCity = queue.poll();
            visitedOrder.add(currentCity);
            
            System.out.println("Mengunjungi: " + currentCity);

            
            List<String> neighbors = getNeighbors(currentCity);
            Collections.sort(neighbors); 

            
            for (String neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);     
                    queue.add(neighbor);       
                }
            }
        }
        return visitedOrder;
    }

    
    public List<String> dfsTraversal(String startCity) {
        
        List<String> visitedOrder = new ArrayList<>();
        
        
        Stack<String> stack = new Stack<>();
        
        
        Set<String> visited = new HashSet<>();

        
        if (!adjacencyList.containsKey(startCity)) {
            System.out.println("Kota " + startCity + " tidak ditemukan!");
            return visitedOrder;
        }

        
        stack.push(startCity);          

        
        while (!stack.isEmpty()) {
            
            String currentCity = stack.pop();
            
            
            if (!visited.contains(currentCity)) {
                visited.add(currentCity);           
                visitedOrder.add(currentCity);
                
                System.out.println("Mengunjungi: " + currentCity);

                
                List<String> neighbors = getNeighbors(currentCity);
                
                Collections.sort(neighbors, Collections.reverseOrder()); 

                
                for (String neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
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
        List<String> bfsResult = ukMap.bfsTraversal(startCity);
        System.out.println("\nRute BFS:");
        printRoute(bfsResult);

        
        System.out.println("\nSKENARIO B: Jelajahi Sejauh Mungkin Dulu (DFS)");
        System.out.println("Strategi: Masuk dalam dulu, baru backtrack");
        System.out.println("---------------------------------------------------");
        List<String> dfsResult = ukMap.dfsTraversal(startCity);
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
    
    
    private static void printRoute(List<String> route) {
        if (route.isEmpty()) {
            System.out.println("❌ Rute tidak dapat dibuat.");
            return;
        }
        
        System.out.print("🛤️  ");
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