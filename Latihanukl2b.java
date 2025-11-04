/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanukl2b;

/**
 *
 * @author Valen
 */
import java.util.Scanner;
public class Latihanukl2b {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double phi = 3.14;
        
        System.out.println("masukkan jari jari");
        double jarijari = input.nextDouble();
        System.out.println("masukkan tinggi");
        double tinggi = input.nextDouble();
        
        double luas = 0;
        luas = 2*phi*jarijari*jarijari+tinggi;
        System.out.println("hasilnya adalah :"+luas);
    }
}
