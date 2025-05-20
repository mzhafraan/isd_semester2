
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Laundry {

    private static LinkedList<Member> members = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Laundry PokokePalingBersih ===");
            System.out.println("1. Tambah Data Member");
            System.out.println("2. Hapus Data Member");
            System.out.println("3. Cari Member");
            System.out.println("4. Tampilkan Member Berdasarkan Lama Member");
            System.out.println("5. Keluar");
            System.out.println("Pilih Menu:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addMember(scanner);
                    break;
                case 2:
                    deleteMember(scanner);
                    break;
                case 3:
                    searchMember(scanner);
                    break;
                case 4:
                    displayMembersDuration(scanner);
                    break;
                case 5:
                    System.out.println("Terimakasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (choice != 5);
    }

    static void addMember(Scanner scanner) {
        System.out.print("Nomor Member: ");
        String noMember = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("Tipe Member (bronze/silver/gold/platinum): ");
        String tipeMember = scanner.nextLine();
        System.out.print("Lama Member (tahun): ");
        int lamaMember = scanner.nextInt();
        scanner.nextLine();

        Member newMember = new Member(noMember, nama, alamat, tipeMember, lamaMember);
        members.add(newMember);
        System.out.println("Data Member Berhasil Ditambahkan");
    }

    static void deleteMember(Scanner scanner) {
        System.out.print("Masukkan Nomor Member yang ingin dihapus: ");
        String deleteNama = scanner.nextLine();

        Iterator<Member> iterator = members.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getNoMember().equals(deleteNama)) {
                iterator.remove();
                System.out.println("Data member berhasil dihapus: ");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Data Member Tidak Ditemukan.");
        }
    }

    static void searchMember(Scanner scanner) {
        System.out.print("Masukkan Nama Member yang ingin dicari: ");
        String searchNama = scanner.nextLine();

        boolean found = false;
        for (Member member : members) {
            if (member.getNama().equals(searchNama)) {
                System.out.println(member);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Data member tidak ditemukan");
        }
    }

    static void displayMembersDuration(Scanner scanner) {
        System.out.print("Masukkan minimal lama member (tahun): ");
        int minDuration = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Member member : members) {
            if (member.getLamaMember() >= minDuration) {
                System.out.println(member);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada member yang memenuhi kriteria.");
        }
    }

}
