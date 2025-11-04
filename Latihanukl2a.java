/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanukl2a;

/**
 *
 * @author Valen
 */
import java.util.Scanner;
public class Latihanukl2a {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int Nilai=0;
        System.out.println("Masukkan nilai :");
        Nilai = inputan.nextInt();
        int hasil=1;
        int faktorial=10;
        while (faktorial>=1 ){
            hasil *= faktorial;
            System.out.println("faktor ke - "+faktorial);
            faktorial--;
        }
        System.out.println("faktorial dari. "+Nilai + ".adalah." + hasil);
    }
}
