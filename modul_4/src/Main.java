public class Main {

    public static void main(String[] args) {
        Hero aldous = new Hero("Yuzong", 100, 80, 15);
        Hero layla  = new Hero("Gatot",  90, 60, 10);

        System.out.println("===== STATUS AWAL =====");
        aldous.tampilkanStatus();
        layla.tampilkanStatus();

        System.out.println("\n===== PERTARUNGAN =====");
        aldous.serang(layla);
        layla.gunakanSkill(aldous);
        aldous.gunakanSkill(layla);
        layla.heal();
        aldous.serang(layla);
        aldous.serang(layla);
        aldous.serang(layla);

        System.out.println("\n===== STATUS AKHIR =====");
        aldous.tampilkanStatus();
        layla.tampilkanStatus();

        System.out.println("\n===== UJI: Hero Mati =====");
        layla.serang(aldous);
        layla.heal();
        layla.gunakanSkill(aldous);

        System.out.println("\n===== UJI: Mana Kurang =====");
        Hero gusion = new Hero("Gusion", 80, 10, 12);
        gusion.gunakanSkill(aldous);

        System.out.println("\n===== UJI: HP Sudah Penuh =====");
        aldous.heal();
    }
}