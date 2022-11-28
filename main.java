package com.Sewa;
//mengimport Scanner
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("Selamat Datang di Traveldoka!");
        System.out.println("Tempat Pemasanan Hotel terbaik!");
        //Mengakses class customer
        Customer name = new Customer();

        //membuka input Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukkan Nama anda: ");
        name.setNama(input.nextLine());
        
        //memberi nilai untuk hari dengan input, dan setter
        System.out.println("Berapa hari anda ingin menginap?");
        Waktu.setHari(input.nextInt());

        //mengakses parameter hotel ke class pesan
        Hotel h = new Pesan();
        //mendeklarasikan hotel h untuk menjelaskan method pada class pesan
        Pemesanan n = new Pemesanan(h);
        System.out.println("Kamar seperti apa yang anda inginkan?");
        System.out.println("______________________________________");
        System.out.println("|No| Jenis Kamar    |Harga           |");
        System.out.println("|1 | Luxury         |Rp.300.000      |");
        System.out.println("|2 | Standar        |Rp.200.000      |");
        System.out.println("|3 | Hemat          |Rp.100.000      |");
        System.out.println("--------------------------------------");

        //memilih nomor dengan switch
        int nomor = input.nextInt();
        switch(nomor){
            case 1:
            n.KamarMahal();
            break;
            case 2:
            n.KamarSedang();
            break;
            case 3:
            n.KamarMurah();
            break;
            default:
            System.out.println("Kamar Tidak tersedia");
        }

        //untuk konfirmasi
        System.out.println("Anda yakin ini mengkonfirmasi pesanan anda?");
        System.out.println("(Y) adalah Ya!");
        System.out.println("(T) adalah Tidak!");
          char konfir = input.next().charAt(0);
            //apabila kita menekan y maka akan terkonfirmasi
            if(konfir == 'y'){
                System.out.println("Pesanan dibuat atas Nama: " + name.getNama());
                System.out.println("terima kasih sudah menggunakan layanan kami!");
            }
            //apabila kita menekan t maka hanya akan muncul pesan seperti di bawah
            else if(konfir == 't'){
                System.out.println("Terima kasih. Sampai jumpa lain kali.");
            }
    }
}
