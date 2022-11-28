package com.Sewa;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("Selamat Datang di Traveldoka!");
        System.out.println("Tempat Pemasanan Hotel terbaik!");
        Customer name = new Customer();

        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukkan Nama anda: ");
        name.setNama(input.nextLine());
        
        System.out.println("Berapa hari anda ingin menginap?");
        Waktu.setHari(input.nextInt());

        Hotel h = new Pesan();
        Pemesanan n = new Pemesanan(h);
        System.out.println("Kamar seperti apa yang anda inginkan?");
        System.out.println("______________________________________");
        System.out.println("|No| Jenis Kamar    |Harga           |");
        System.out.println("|1 | Luxury         |Rp.300.000      |");
        System.out.println("|2 | Standar        |Rp.200.000      |");
        System.out.println("|3 | Hemat          |Rp.100.000      |");
        System.out.println("--------------------------------------");

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

        System.out.println("Anda yakin ini mengkonfirmasi pesanan anda?");
        System.out.println("(Y) adalah Ya!");
        System.out.println("(T) adalah Tidak!");
          char konfir = input.next().charAt(0);
            if(konfir == 'y'){
                System.out.println("Pesanan dibuat atas Nama: " + name.getNama());
                System.out.println("terima kasih sudah menggunakan layanan kami!");
            }
            else if(konfir == 't'){
                System.out.println("Terima kasih. Sampai jumpa lain kali.");
            }
    }
}
