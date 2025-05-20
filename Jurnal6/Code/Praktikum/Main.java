package Jurnal6.Code.Praktikum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet team = new HashSet(5);

        System.out.println("Masukkan Nama 5 Pemain Utama");
        for (int i = 0; i < 5; i++) {
            String playerName = input.nextLine();
            team.add(playerName);
        }

        System.out.println("Masukkan Nama Pemain Pengganti, (Ketik 'done' untuk menyelesaikan):");
        while (true) {
            String playerName = input.nextLine();
            if (playerName.equalsIgnoreCase("done") ) {
                break;
            }
            team.add(playerName);
        }

        System.out.println("\nAll Team Members:");
        team.printAll();

        System.out.println("\nMain Players:");
        team.printMainPlayers();

        System.out.println("\nSubs Player:");
        team.printSubstitutes();
    }
}
