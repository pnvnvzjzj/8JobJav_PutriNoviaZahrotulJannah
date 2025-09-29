/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author lenov
 */
public class Main {
    public static void main(String[] argv){
        Lingkaran l = new Lingkaran();
        l.hitungLuas(14);
        l.hitungKeliling(14);
        l.tampilData();
        System.out.println("--------------------");
        SegiTigaSamaKaki sg = new SegiTigaSamaKaki();
        sg.hitungLuas(8,3);
        sg.hitungKeliling(8,3);
        sg.tampilData();
        System.out.println("--------------------");
        SegiEmpat se = new SegiEmpat();
        se.hitungLuas(5,8);
        se.hitungKeliling(5,8);
        se.hitungDiagonal(5,8);
        se.tampilData();
    }
}
