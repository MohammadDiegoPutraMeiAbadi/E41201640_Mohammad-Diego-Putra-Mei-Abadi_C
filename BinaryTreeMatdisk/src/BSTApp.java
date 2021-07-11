/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class BSTApp {
     public static void main(String[] args){
        Node x1= new Node(25);
        Node x2= new Node(20);
        Node x3= new Node(9);
        Node x4= new Node(15);
        Node x5= new Node(5);
        Node x6= new Node(22);
        Node x7= new Node(23);
        
        x1.kiri = x2;
        x1.kanan = x5;
        
        x2.kiri = x3;
        x2.kanan = x4;
        
        x5.kiri = x6;
        x5.kanan = x7;
                
        
        
        BST bst = new BST(x1);
        
        System.out.println("Nama : Mohammad Diego Putra Mei Abadi");
        System.out.println("NIM  : E41201640");
        System.out.println("GOL  : C");
        System.out.println("--------------------------------");
        bst.preOrder(bst.root);
        System.out.println(" = PreOrder" );
        bst.inOrder(bst.root);
        System.out.println(" = InOrder " );
        bst.postOrder(bst.root);
        System.out.println(" = PostOrder");
    }
}
