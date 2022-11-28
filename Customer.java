package com.Sewa;

public class Customer {
    private String nama;  
    
    //Method constructor kosong
    public Customer(){
        
    }

//Method constructor untuk parameter nama
public Customer(String nama){
    this.nama=nama;
}
//Method mutator untuk mengambil nilai
public String getNama(){
    return this.nama;
}
//Method accessor untuk meberi nilai
public void setNama(String n){
    nama = n;
}
}

