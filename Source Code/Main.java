/*
Saya Themy Sabri Syuhada dengan NIM 2203903. 
Demi keberkahan-Nya, saya berjanji mengerjakan 
TP 1 DPBO dengan jujur dan tidak melakukan 
kecurangan seperti yang telah dispesifikasikan.
Aamiin.
 */

public class Main {
    public static void main(String[] args) {
        // Inisialisasi karakter
        Player nova = new Player("Nova", "M", "Sword", "Warrior", 100, 28);
        Player jane = new Player("Jane", "F", "Magic Staff", "Priest", 80, 10);
        Player sora = new Player("Sora", "M", "Bow", "DPS", 100, 20);
        Player aloy = new Player("Aloy", "F", "Magic Staff", "Wizard", 80, 25);
        NPC adrian = new NPC("Adrian", "M", "Quest Giver", "null", 0, 0, true);
        Enemy thor = new Enemy("Thor", "M", "Boss", "Excalibur Sword", 120, 35);

        // Menambahkan item ke inventory pemain
        nova.addToInventory(new Item("Sword"));
        nova.addToInventory(new Item("Armor"));
        jane.addToInventory(new Item("Scripture"));
        sora.addToInventory(new Item("Bow"));
        sora.addToInventory(new Item("Armor"));
        aloy.addToInventory(new Item("Magic Wand"));

        // Menampilkan informasi karakter sebelum pertarungan
        System.out.println("Before Battle:");
        System.out.println(nova);
        System.out.println(jane);
        System.out.println(sora);
        System.out.println(aloy);
        System.out.println(adrian);
        System.out.println(thor);

        System.out.println("\n");

        // Sapaan dari NPC sebelum memulai pertarungan
        adrian.interact();
        thor.interact();

        // Pertarungan dimulai
        System.out.println("\nBattle Begins!\n");

        // Nova menyerang Thor
        nova.attack(thor);
        // Thor menyerang Nova
        thor.attack(nova);
        // Sora menyerang Thor
        sora.attack(thor);
        // Aloy menyerang Thor
        aloy.attack(thor);
        // Thor menyerang Aloy
        thor.attack(aloy);
        // Jane mencoba menggunakan Heal Potion untuk menyembuhkan dirinya
        jane.useItem(new Item("Heal Potion"));
        /*
         * Baris kode yang Jane pake heal potion itu kan nambah ke inventory dulu.
         * Cuma, gatau kenapa malah ga masuk ke array list inventory Jane.
         * Udah coba dicari bug-nya, masih belum nemu.
         * Harusnya Jane sukses pake heal potionnya.
         */
        // Nova menyerang Thor lagi
        nova.attack(thor);
        // Thor menyerang Nova lagi
        thor.attack(nova);
        // Jane menyerang Thor
        jane.attack(thor);
        // Sora menyerang Thor lagi
        sora.attack(thor);

        // Menampilkan informasi karakter setelah pertarungan
        System.out.println("\nAfter Battle:");
        System.out.println(nova);
        System.out.println(jane);
        System.out.println(sora);
        System.out.println(aloy);
        System.out.println(adrian);
        System.out.println(thor);
    }
}
