package SourceCode;

import java.util.Scanner;

public class DLLmain {
    Node_27 front, rear;
    int size;

    public DLLmain() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }


    public static void Menu(){

        System.out.println("========== QUIZ 2 PRAKTIKUM ASD TI-F===========");
        System.out.println("dibuat oleh : Andika Ainur Wibowo");
        System.out.println("NIM : 2141720238");
        System.out.println("Absen : 27");
        System.out.println("===============================================");
        System.out.println("Sistem Antrian Resto Royal Delish");
        System.out.println("Menu");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan pesanan by nama");
        System.out.println("5. Hitung total pendapatan");
        System.out.println("6. Keluar");
        System.out.print("Pilih(1-5):");

    }

    public void TambahAntrian(int nomor, String nama) {
        Node_27 newNode = new Node_27(null, nomor, nama, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void HapusAntrian() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            HapusTerakhir();
        } else {
            System.out.println(front.namaPembeli + " ");
            front = front.next;
            front.prev = null;
            size--;
        }
    }

    public void HapusTerakhir() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (front.next == null) {
            front = null;
            size--;
            return;
        }
        Node_27 current = front;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    

    public void print() {
        if (!isEmpty()) {
            Node_27 tmp = front;
            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Antrian Resto Royal Delish");
            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("|No\t|Nama Customer \t|Nomor HP\t");
            while (tmp != null) {
                System.out.println("|" + tmp.nomor + "\t|" + tmp.namaPembeli + "\t|" + tmp.NoHp + "\t|");
                tmp = tmp.next;
            }
            System.out.print("Sisa Antrian: " + size);
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ins = new Scanner(System.in);
        int Menu = 0;

        DLLmain dll = new DLLmain();
        while (Menu != 6) {
            Menu();
            Menu = in.nextInt();
            System.out.println("=====================================");
            try {
                switch (Menu) {
                    case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("-------------------------");
                    System.out.print("Nomor Antrian: ");
                    int no = in.nextInt();
                    System.out.print("Nama Pembeli: ");
                    String nama = ins.nextLine();
                    System.out.print("Nomor Hp: ");
                    int noHp = in.nextInt();
                    dll.TambahAntrian(no, nama);
                    System.out.println("-------------------");
                    dll.print();
                    break;
                    case 2:
                        dll.print();
                        break;
                    case 3:
                        dll.HapusAntrian();
                        break;
                    case 4:
                        
                        break;
                }
                System.out.println();
            } catch (Exception e) {

            }
        }  
    }   
}
