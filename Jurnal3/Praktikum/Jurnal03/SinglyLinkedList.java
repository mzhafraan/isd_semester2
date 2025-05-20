package Jurnal03;

public class SinglyLinkedList {
    private Node firstNode;
    private Node lastNode;

    public SinglyLinkedList() {
        this.firstNode = null;
        this.lastNode = null;
    }

    // Tambah Resep di Awal
    public void tambahResepAwal(Resep resep) {
        Node newNode = new Node(resep);
        if (firstNode == null) {
            firstNode = lastNode = newNode;
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    // Tambah Resep di Akhir
    public void tambahResepAkhir(Resep resep) {
        Node newNode = new Node(resep);
        if (firstNode == null) {
            firstNode = lastNode = newNode;
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    // Hapus Resep dari Awal
    public void hapusResepAwal() {
        if (firstNode == null) {
            System.out.println("Daftar resep kosong.");
            return;
        }
        firstNode = firstNode.next;
        if (firstNode == null) {
            lastNode = null;
        }
    }

    // Hapus Resep dari Akhir
    public void hapusResepAkhir() {
        if (firstNode == null) {
            System.out.println("Daftar resep kosong.");
            return;
        }
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
            return;
        }
        Node iterator = firstNode;
        while (iterator.next != lastNode) {
            iterator = iterator.next;
        }
        iterator.next = null;
        lastNode = iterator;
    }

    // Cetak Semua Resep
    public void cetakResep() {
        if (firstNode == null) {
            System.out.println("Daftar resep kosong.");
            return;
        }
        Node iterator = firstNode;
        while (iterator != null) {
            iterator.data.tampilkanResep();
            System.out.println("----------------");
            iterator = iterator.next;
        }
    }

    // Cari Resep berdasarkan Nama dengan instanceof
    public void cariResep(String namaResep) {
        Node iterator = firstNode;
        while (iterator != null) {
            if (iterator.data instanceof Resep) {
                Resep resep = (Resep) iterator.data;
                if (resep.getNamaResep().equals(namaResep)) {
                    System.out.println("Resep ditemukan:");
                    resep.tampilkanResep();
                    return;
                }
            }
            iterator = iterator.next;
        }
        System.out.println("Resep tidak ditemukan.");
    }
}
