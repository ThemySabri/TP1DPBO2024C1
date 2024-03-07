/*
Saya Themy Sabri Syuhada dengan NIM 2203903. 
Demi keberkahan-Nya, saya berjanji mengerjakan 
TP 1 DPBO dengan jujur dan tidak melakukan 
kecurangan seperti yang telah dispesifikasikan.
Aamiin.
 */

class NPC extends Character {
    protected boolean friendly; // Atribut untuk menentukan apakah NPC bersahabat atau tidak

    // Konstruktor untuk membuat objek NPC dengan nama, jenis kelamin, senjata,
    // peran, HP, ATK, dan sifat friendly tertentu
    public NPC(String name, String gender, String role, String weapon, int hp, int atk, boolean friendly) {
        // Memanggil konstruktor kelas induk (Character) dengan menggunakan kata kunci
        // super
        super(name, gender, weapon, role, hp, atk);
        // Menginisialisasi atribut friendly
        this.friendly = friendly;
    }

    // Metode untuk berinteraksi dengan NPC
    public void interact() {
        // Jika NPC bersahabat, cetak pesan sapaan kepada pemain
        if (friendly) {
            System.out.println(name + " says: Hello traveler!");
        } else {
            // Jika NPC tidak bersahabat, cetak pesan bahwa NPC menyerang
            System.out.println(name + " attacks!");
        }
    }

    // Metode untuk merepresentasikan NPC dalam bentuk string
    public String toString() {
        // Menggunakan metode toString dari kelas induk (Character) untuk mendapatkan
        // informasi dasar karakter NPC
        // Ditambah dengan informasi apakah NPC bersahabat atau tidak
        return super.toString() + ", Friendly: " + friendly;
    }
}
