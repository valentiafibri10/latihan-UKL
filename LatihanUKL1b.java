/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanukl1b;

/**
 *
 * @author Valen
 */
import java.util.Scanner;
public class LatihanUKL1b {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int bilangan;
       System.out.println("Masukkan Bilangan : ");
       bilangan = input.nextInt();
       
       if (bilangan % 2 ==0){
           System.out.println("Bilangan Genap");
           System.out.println("Bilangan ini bisa dibagi 2");
       }else{
           System.out.println("Bilangan Ganjil");
           System.out.println("Bilangan ini tidak bisa dibagi 2");
           System.out.println("karena hasil bagi sisa 1");
       }
   
    }
}
