/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanukl3a;

/**
 *
 * @author Valen
 */
import java.util.Scanner;
public class Latihanukl3a {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double n1,n2,n3;
        
        System.out.println("masukkan nilai1");
        n1 = input.nextDouble();
        System.out.println("masukkan nilai2");
        n2 = input.nextDouble();
        System.out.println("masukkan nilai3");
        n3 = input.nextDouble();
        
        double ratarata = 0;
        ratarata = (n1+n2+n3)/3;
        System.out.println("hasilnya adalah :"+ratarata);
    } 
}
