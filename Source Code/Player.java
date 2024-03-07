/*
Saya Themy Sabri Syuhada dengan NIM 2203903. 
Demi keberkahan-Nya, saya berjanji mengerjakan 
TP 1 DPBO dengan jujur dan tidak melakukan 
kecurangan seperti yang telah dispesifikasikan.
Aamiin.
 */

class Player extends Character {
    private Inventory inventory; // Mendefinisikan atribut untuk menyimpan inventory pemain

    // Konstruktor untuk membuat objek pemain dengan nama, jenis kelamin, senjata,
    // peran, HP, dan ATK tertentu
    public Player(String name, String gender, String weapon, String role, int hp, int atk) {
        // Memanggil konstruktor kelas induk (Character) dengan menggunakan kata kunci
        // super
        super(name, gender, weapon, role, hp, atk);
        // Menginisialisasi inventory pemain
        inventory = new Inventory();
    }

    // Metode untuk menambahkan item ke inventory pemain
    public void addToInventory(Item item) {
        inventory.addItem(item);
    }

    // Metode untuk menggunakan item dari inventory pemain
    public void useItem(Item item) {
        // Memeriksa apakah item ada dalam inventory pemain
        if (inventory.contains(item)) {
            // Jika item ada, cetak pesan bahwa pemain menggunakan item
            System.out.println(name + " uses " + item.getName() + "!");
            // Hapus item dari inventory pemain setelah digunakan
            inventory.removeItem(item);
        } else {
            // Jika item tidak ada, cetak pesan bahwa pemain tidak memiliki item tersebut
            System.out.println(name + " does not have " + item.getName() + " in inventory!");
        }
    }

    // Metode untuk merepresentasikan karakter pemain dalam bentuk string
    public String toString() {
        // Menggunakan metode toString dari kelas induk (Character) untuk mendapatkan
        // informasi dasar karakter
        // Ditambah dengan informasi inventory pemain
        return super.toString() + ", Inventory: " + inventory.toString();
    }
}
