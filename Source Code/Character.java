/*
Saya Themy Sabri Syuhada dengan NIM 2203903. 
Demi keberkahan-Nya, saya berjanji mengerjakan 
TP 1 DPBO dengan jujur dan tidak melakukan 
kecurangan seperti yang telah dispesifikasikan.
Aamiin.
 */

abstract class Character {
    protected String name; // Atribut untuk menyimpan nama karakter
    protected String gender; // Atribut untuk menyimpan jenis kelamin karakter
    protected String weapon; // Atribut untuk menyimpan senjata karakter
    protected String role; // Atribut untuk menyimpan peran/role karakter
    protected int hp; // Atribut untuk menyimpan jumlah HP (Health Points) karakter
    protected int atk; // Atribut untuk menyimpan kekuatan serangan (Attack Points) karakter

    // Konstruktor untuk menginisialisasi karakter dengan nilai awal
    public Character(String name, String gender, String weapon, String role, int hp, int atk) {
        this.name = name;
        this.gender = gender;
        this.weapon = weapon;
        this.role = role;
        this.hp = hp;
        this.atk = atk;
    }

    // Metode untuk menyerang karakter target
    public void attack(Character target) {
        System.out.println(name + " attacks " + target.name + "!");
        target.takeDamage(atk);
    }

    // Metode untuk mengurangi HP karakter saat menerima serangan
    public void takeDamage(int damage) {
        hp -= damage;
        System.out.println(name + " takes " + damage + " damage!");
    }

    // Metode untuk representasi string dari objek karakter
    public String toString() {
        return name + " (" + gender + ") - Role: " + role + ", Weapon: " + weapon + ", HP: " + hp + ", ATK: " + atk;
    }
}
