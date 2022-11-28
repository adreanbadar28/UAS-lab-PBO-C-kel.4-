package com.Sewa;

public class Pesan implements Hotel{
    Biaya b = new Biaya();

    public void luxury(){
        b.setHarga(300);
        System.out.println("Total harga pemesanan anda adalah Rp." + b.getTotal() + "000");

    }
    public void standar(){
        b.setHarga(200);
        System.out.println("Total harga pemesanan anda adalah Rp." + b.getTotal() + "000");
    }
    public void hemat(){
        b.setHarga(100);
        System.out.println("Total harga pemesanan anda adalah Rp." + b.getTotal() + "000");
    }
       
}