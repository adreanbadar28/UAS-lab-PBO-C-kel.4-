package com.Sewa;

public class Biaya extends Waktu {
    private int harga;

    public Biaya(){

    }
    public Biaya(int harga){
        this.harga = harga;
    }

    public int getHarga(){
        return this.harga;
    }
    public void setHarga(int h){
        this.harga = h;
    }
    public int getTotal(){
        return super.getHari()*getHarga();
    }
}
