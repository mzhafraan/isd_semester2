package Jurnal6.Code.Praktikum;

import java.util.ArrayList;

public class HashSet {
    private Node[] table;
    private int capacity;
    private ArrayList<String> mainPlayers;

    public HashSet(int capacity) {
        this.capacity = capacity;
        this.table = new Node[capacity];
        this.mainPlayers = new ArrayList<>();
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void add(String playerName) {
        if (mainPlayers.size() < capacity){
            mainPlayers.add(playerName);
        }
        
        int index = hash(playerName);
        Node newNode = new Node(playerName);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printAll() {
        for (int i = 0; i < capacity; i++) {
            Node current = table[i];
            while (current != null) {
                System.out.println(current.playerName);
                current = current.next;
            }
        }
    }

    public void printMainPlayers(){
        for (int i = 0; i < mainPlayers.size(); i++){
            System.out.println(mainPlayers.get(i));
        }
    }

    public void printSubstitutes() {
        for (int i = 0; i < capacity; i++) {
            Node current = table[i];
            if (current != null) {
                current = current.next;
                while (current != null) {
                    System.out.println(current.playerName);
                    current = current.next;
                }
            }
        }
    }
}