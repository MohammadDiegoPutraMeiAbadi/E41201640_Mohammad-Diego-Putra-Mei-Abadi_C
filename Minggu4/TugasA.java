/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.wsid.w04;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class TugasA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        //perintah awal
        System.out.print("Masukkan nilai max: ");
        n=scan.nextInt();
        //masukkan perulangan for
        for(int i=2; i <= n; i += 2) {
            System.out.print(i + " ");
            
        }
    }
    
}
