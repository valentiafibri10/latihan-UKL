/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanukl;

/**
 *
 * @author Valen
 */
import java.util.Scanner;
public class LatihanUKL {
    
    public static void main(String[] args) {
       Scanner masukan = new Scanner(System.in);
       System.out.println("masukkan panjang :");
       int panjang = masukan.nextInt();
       
       System.out.println("masukkan lebar :");
       int lebar = masukan.nextInt();
       
       System.out.println("masukkan tinggi :");
       int tinggi = masukan.nextInt();
       
       int volume = 0;
       volume = panjang*lebar*tinggi;
       System.out.println("hasil= "+volume);
       
       System.out.println("masukkan jarak :");
       int jarak =  masukan.nextInt();
       
       System.out.println("masukkan berat :");
       int berat =  masukan.nextInt();
       
       int biayaperKg = 0;
       
        if (jarak <= 10){
            biayaperKg = jarak*4250;
        }else {
            biayaperKg = jarak*6000;
        }int harga = berat*biayaperKg;
        System.out.println("hasil= "+harga);      
    }
}
