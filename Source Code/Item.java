/*
Saya Themy Sabri Syuhada dengan NIM 2203903. 
Demi keberkahan-Nya, saya berjanji mengerjakan 
TP 1 DPBO dengan jujur dan tidak melakukan 
kecurangan seperti yang telah dispesifikasikan.
Aamiin.
 */

class Item {
    private String name; // Mendefinisikan atribut untuk menyimpan nama item

    // Konstruktor untuk membuat objek item dengan nama tertentu
    public Item(String name) {
        this.name = name;
    }

    // Metode untuk mendapatkan nama item
    public String getName() {
        return name;
    }

    // Metode untuk merepresentasikan item dalam bentuk string
    public String toString() {
        return name;
    }
}
