package SourceCode;
public class Node_27{
    public String namaPembeli;
    public int nomor;
    public String NoHp;
    public Node_27 prev, next;

    public Node_27(Node_27 prev, int nomor, String nama, Node_27 next) {
        this.prev = prev;
        this.namaPembeli = nama;
        this.nomor = nomor;
        this.next = next;
    }
}