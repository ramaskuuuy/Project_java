package com.example;

public class Main {
    public static void main(String[] args) {
        Apartment apartemen = new Apartment();
        Apartment apartemen2 = new Apartment("Biru");
        Rumah rumah = new Rumah();

       System.out.println(apartemen.warna);
       System.out.println(apartemen2.orang[0]);
       System.out.println(rumah.warna);



        
    }
}

class Manusia{
    protected String nama;
    protected int umur;

    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
}

class Rumah{
    public String warna = "Merah";
}

class Apartment extends Rumah{
    public Manusia [] orang = new Manusia[10];
    public Apartment() {  }

    public Apartment(String warna) {
        this.warna = warna;
    }
}