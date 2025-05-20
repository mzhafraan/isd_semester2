
import java.util.LinkedList;
import java.util.Scanner;


public class LaundryPokokePalingBersih {
    private LinkedList<Member2> members = new LinkedList<>();

    public void tambahDataMember(String noMember, String nama, String alamat, String tipeMember, int lamaMember){
        Member2 member = new Member2(noMember, nama, alamat, tipeMember, lamaMember);
        members.add(member);
        System.out.println("Data Member Berhasil Ditambahkan.");
    }

    public void hapusDataMember(String noMember){
        for (Member2 member : members){
            if (member.getNoMember().equals(noMember)){
                members.remove(member);
                System.out.println("Data member berhasil dihapus.");
                return;
            }
        }
        System.out.println("Data member tidak ditemukan.");
    }

    public void cariMemberByNama(String nama) {
        boolean found = false;
        for (Member2 member : members) {
            if (member.getNama().equalsIgnoreCase(nama)){
                System.out.println(member);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data member tidak ditemukan.");
        }
    }

    public void tampilkanMemberByTahun(int tahun){
        boolean found = false;
        for (Member2 member : members) {
            if (member.getLamaMember() > tahun) {
                System.out.println(member);
                found = true;
            }
        }
        if(!found){
            System.out.println("Tidak ada member.");
        }
    }

    public static void main(String[] args) {
        LaundryPokokePalingBersih laundry = new LaundryPokokePalingBersih();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Laundry PokokePalingBersih ===");
            System.out.println("1. Tambah Data Member");
            System.out.println("2. Hapus Data Member");
            System.out.println("3. Cari Member Berdasarkan Nama");
            System.out.println("4. Tampilkan Member Berdasarkan Lama Member");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("No Member: ");
                    String noMember = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = scanner.nextLine();
                    System.out.print("Tipe Member (bronze/silver/gold/platinum): ");
                    String tipeMember = scanner.nextLine();
                    System.out.print("Lama Member (tahun): ");
                    int lamaMember = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    laundry.tambahDataMember(noMember, nama, alamat, tipeMember, lamaMember);
                    break;
                case 2:
                    System.out.print("Masukkan No Member yang ingin dihapus: ");
                    String noMemberToDelete = scanner.nextLine();
                    laundry.hapusDataMember(noMemberToDelete);
                    break;
                case 3:
                    System.out.print("Masukkan Nama Member yang ingin dicari: ");
                    String namaToSearch = scanner.nextLine();
                    laundry.cariMemberByNama(namaToSearch);
                    break;
                case 4:
                    System.out.print("Masukkan minimal lama member (tahun): ");
                    int minDuration = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    laundry.tampilkanMemberByTahun(minDuration);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi Laundry PokokePalingBersih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 5);
    }
}
