/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author lenov
 */
public class BangunDatar {
    
    public double luas;
    public double keliling;
        
        public void hitungLuas(){
        luas = 0;
    }
       public void hitungKeliling(){
        keliling = 0;
    } 
       public void tampilData() {
           System.out.println("Luas" + luas);
           System.out.println("Keliling" + keliling);
    }
}