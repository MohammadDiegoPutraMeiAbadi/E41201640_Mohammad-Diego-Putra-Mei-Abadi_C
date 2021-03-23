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
public class TugasB {
    public static void main(String[] args) {
    
        System.out.println("Tugas B :");
        System.out.println();
        System.out.println("Masukkan berapa banyak random angka :");
        Scanner scan = new Scanner(System.in);
        
        int jumlah = scan.nextInt();
        int[] arl = new int [jumlah];
        for (int i = 0; i < arl.length; i++){
            arl[i] = (int)(Math.random() * 100);
            System.out.print(arl[i] + " ");
        }
        System.out.println("");
    }
}

