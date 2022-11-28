package com.Sewa;

public class Pemesanan {
    private Hotel h;

    public Pemesanan(Hotel h){
        this.h = h;
    }
    public void KamarMahal(){
        this.h.luxury();
    }
    public void KamarSedang(){
        this.h.standar();
    }
    public void KamarMurah(){
        this.h.hemat();
    }
    
}
