/*
Saya Themy Sabri Syuhada dengan NIM 2203903. 
Demi keberkahan-Nya, saya berjanji mengerjakan 
TP 1 DPBO dengan jujur dan tidak melakukan 
kecurangan seperti yang telah dispesifikasikan.
Aamiin.
 */

class Enemy extends NPC {
    // Konstruktor untuk membuat objek musuh dengan nama, jenis kelamin, senjata,
    // peran, HP, dan ATK tertentu
    public Enemy(String name, String gender, String weapon, String role, int hp, int atk) {
        // Memanggil konstruktor kelas induk (NPC) dengan menggunakan kata kunci super
        // Musuh (Enemy) umumnya dianggap tidak bersahabat (friendly = false)
        super(name, gender, role, weapon, hp, atk, false);
    }

    // Metode untuk mengurangi HP musuh saat menerima serangan
    public void takeDamage(int damage) {
        // Memanggil metode takeDamage dari kelas induk (NPC) untuk mengurangi HP musuh
        super.takeDamage(damage);
        // Jika HP musuh habis, cetak pesan bahwa musuh telah dikalahkan
        if (hp <= 0) {
            System.out.println("\n" + name + " is defeated!" + "\n");
            System.out.println("Congratulations on defeating the boss, Travelers!");
        }
    }
}
