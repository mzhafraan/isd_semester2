import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Player> roster = new HashMap<>();

        Player p1 = new Player("Joryu", 51, "CF", "8");
        Player p2 = new Player("Majima", 55, "GK", "1");
        Player p3 = new Player("Ichiban", 42, "ST", "10");
        Player p4 = new Player("Majima", 55, "GK", "1");
        Player p5 = new Player("Akiyama", 42, "CDM", "6");
        Player[] players = { p1, p2, p3, p4, p5 };

        addElements(players, roster);
        System.out.println();
        System.out.println("roster: " + roster);
    }

    public static void addElements(Player[] players, HashMap<Integer, Player> roster) {
        for (Player player : players) {
            int key = player.hashCode();
            if (roster.containsKey(key)) {
                System.out.printf("Duplicate: %s majima everywhere!!\n", player);
            } else {
                roster.put(key, player);
                System.out.printf("Adding player successful.\n");
            }
        }
    }
}