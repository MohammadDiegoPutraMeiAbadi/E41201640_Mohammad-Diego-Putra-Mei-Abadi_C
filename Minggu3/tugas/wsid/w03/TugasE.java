/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.wsid.w03;
import java.util.Scanner; 
/**
 *
 * @author asus
 */
public class TugasE {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int pesan, pilih;
        String nama, menu;
        System.out.println("CAFE CERIA");
        System.out.println("Aneka Minuman");
        System.out.println("-----------------------");
        System.out.print("Masukkan Nama Pembeli : ");
        nama = input.next();
        System.out.print("SPECIAL MENU :\n 1. Soft Drink\n 2. Mix Juice\n 3. Nescafe\n 4. Soda Milk\n 5. Tea\n");
        System.out.println("Silahkan Masukkan Pilihan Anda : ");
        pilih = input.nextInt();
        
        switch(pilih){
            
     
            case 1:
                System.out.println("Nama Pembeli : " +nama);
                System.out.println("Masukkan Pilihan Anda : " +pilih);
                System.out.println("Minuman yang anda pesan adalah Soft Drink");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terimakasih " + nama + "telah memesan di CAFE CERIA" );
                System.out.println();
                break;

            case 2:
                System.out.println("Nama Pembeli : " +nama);
                System.out.println("Masukkan Pilihan Anda : " +pilih);
                System.out.println("Minuman yang anda pesan adalah Mix Juice");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terimakasih " + nama + "telah memesan di CAFE CERIA" );
                System.out.println();
                break;

            case 3:
                System.out.println("Nama Pembeli : " +nama);
                System.out.println("Masukkan Pilihan Anda : " +pilih);
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terimakasih " + nama + "telah memesan di CAFE CERIA" );
                System.out.println();
                break;
       
            case 4 :
                System.out.println("Nama Pembeli : " +nama);
                System.out.println("Masukkan Pilihan Anda : " +pilih);
                System.out.println("Minuman yang anda pesan adalah Soda Milk");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terimakasih " + nama + "telah memesan di CAFE CERIA" );
                System.out.println();
                break;

            case 5 :
                System.out.println("Nama Pembeli : " +nama);
                System.out.println("Masukkan Pilihan Anda : " +pilih);
                System.out.println("Minuman yang anda pesan adalah Tea");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terimakasih " + nama + "telah memesan di CAFE CERIA" );
                System.out.println();
                break;
    }
    }
}

