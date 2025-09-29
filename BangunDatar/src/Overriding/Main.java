/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Overriding;

/**
 *
 * @author lenov
 */
public class Main {
    public static void main(String[] args) {   
        Lingkaran lingkaran = new Lingkaran(14);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        lingkaran.tampilData();
        System.out.println("--------------------");
        SegitigaSamaKaki sg = new SegitigaSamaKaki(8, 3);
        sg.hitungLuas();
        sg.hitungKeliling();
        sg.tampilData();
        System.out.println("--------------------");
        SegiEmpat se = new SegiEmpat(5, 8);
        se.hitungLuas();
        se.hitungKeliling();
        se.tampilData();
    }
}
