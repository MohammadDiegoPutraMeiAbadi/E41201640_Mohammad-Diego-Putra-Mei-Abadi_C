/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_W02.Exercise_1;

/**
 *
 * @author asus
 */
public class person {

   String fName;
   String lName;
   String stuId;
   String stuStatus;
   
   private void setfName(String fName) {
       this.fName = fName;
   }
   
   private String getfName() {
       return fName;
   }
   
   private void setlName(String lName) {
       this.lName = lName;
   }
   
   private String getlName() {
       return lName;
   }
   
   private void setstuId (String stuId) {
       this.stuId = stuId;
   }
   
   private String getstuId() {
       return stuId;
   }
   
   private void setstuStatus (String stuStatus) {
       this.stuStatus = stuStatus;
   }
   
   private String getstuStatus () {
       return stuStatus;
   }
   
   public static void main(String[] args) {
       person student = new person();
       student.setfName("Mohammad Diego Putra");
       student.setlName("Mei Abadi");
       student.setstuId("E41201640");
       student.setstuStatus("Active");
       
       System.out.println("Student Name : " + student.getfName() + " " + student.getlName());
       System.out.println("Student ID : " + student.getstuId());
       System.out.println("Student Status : " + student.getstuStatus());
   }
}

