/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_W02.Exercise_2;

/**
 *
 * @author asus
 */
public class managingpeople {
    
    public static void main(String[] args) {
        managingpeople_class p1 = new managingpeople_class("Diego", 18);
        managingpeople_class p2 = new managingpeople_class("Rafif", 20);
        
        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
        
    }
}
