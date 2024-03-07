/*
Saya Themy Sabri Syuhada dengan NIM 2203903. 
Demi keberkahan-Nya, saya berjanji mengerjakan 
TP 1 DPBO dengan jujur dan tidak melakukan 
kecurangan seperti yang telah dispesifikasikan.
Aamiin.
 */

import java.util.ArrayList;

class Inventory {
    private ArrayList<Item> items; // Mendefinisikan atribut untuk menyimpan daftar item dalam inventaris

    // Konstruktor untuk membuat objek inventaris dengan daftar item kosong
    public Inventory() {
        items = new ArrayList<>();
    }

    // Metode untuk menambahkan item ke dalam inventaris
    public void addItem(Item item) {
        items.add(item);
    }

    // Metode untuk menghapus item dari inventaris
    public void removeItem(Item item) {
        items.remove(item);
    }

    // Metode untuk memeriksa apakah item tertentu ada dalam inventaris
    public boolean contains(Item item) {
        return items.contains(item);
    }

    // Metode untuk merepresentasikan inventaris dalam bentuk string
    public String toString() {
        return items.toString();
    }
}
