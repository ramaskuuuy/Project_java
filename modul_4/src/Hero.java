public class Hero {

    
    private String nama;
    private int hp;
    private int mana;
    private int damage;

    
    public Hero(String nama, int hp, int mana, int damage) {
        this.nama = nama;

        if (hp < 0) this.hp = 0;
        else if (hp > 100) this.hp = 100;
        else this.hp = hp;

        if (mana < 0) this.mana = 0;
        else if (mana > 100) this.mana = 100;
        else this.mana = mana;

        if (damage < 0) this.damage = 0;
        else if (damage > 15) this.damage = 15;
        else this.damage = damage;
    }

    
    public String getNama()   { return nama;   }
    public int    getHp()     { return hp;     }
    public int    getMana()   { return mana;   }
    public int    getDamage() { return damage; }

    
    public void serang(Hero musuh) {
        if (this.hp == 0) {
            System.out.println(this.nama + " sudah mati, tidak bisa menyerang!");
            return;
        }
        musuh.hp = musuh.hp - this.damage;
        if (musuh.hp < 0) musuh.hp = 0;
        System.out.println(this.nama + " menyerang " + musuh.nama
            + " (-" + this.damage + " HP). HP " + musuh.nama + " tersisa: " + musuh.hp);
        if (musuh.hp == 0) System.out.println(musuh.nama + " TERBUNUH!");
    }


    public void gunakanSkill(Hero musuh) {
        if (this.hp == 0) {
            System.out.println(this.nama + " sudah mati, tidak bisa pakai skill!");
            return;
        }
        if (this.mana < 25) {
            System.out.println(this.nama + " mana tidak cukup! (Mana: " + this.mana + "/25)");
            return;
        }
        int skillDamage = this.damage * 2;
        this.mana = this.mana - 25;
        musuh.hp  = musuh.hp - skillDamage;
        if (musuh.hp < 0) musuh.hp = 0;
        System.out.println(this.nama + " pakai skill ke " + musuh.nama
            + " (-" + skillDamage + " HP). HP " + musuh.nama + " tersisa: " + musuh.hp);
        if (musuh.hp == 0) System.out.println(musuh.nama + " TERBUNUH!");
    }

   
    public void heal() {
        if (this.hp == 0) {
            System.out.println(this.nama + " sudah mati, tidak bisa heal!");
            return;
        }
        if (this.hp >= 100) {
            System.out.println(this.nama + " HP sudah penuh, tidak bisa regen!");
            return;
        }
        this.hp = this.hp + 15;
        if (this.hp > 100) this.hp = 100;
        System.out.println(this.nama + " regen! HP sekarang: " + this.hp);
    }

    public void tampilkanStatus() {
        String status = (this.hp > 0) ? "ALIVE" : "DEAD";
        System.out.println("-------------------------------");
        System.out.println("Nama   : " + nama);
        System.out.println("HP     : " + hp + "/100");
        System.out.println("Mana   : " + mana + "/100");
        System.out.println("Damage : " + damage);
        System.out.println("Status : " + status);
        System.out.println("-------------------------------");
    }
}