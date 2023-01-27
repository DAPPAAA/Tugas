/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author daff9
 */
public class persegipanjang {
    double panjang;
    double lebar;
    Scanner sc=new Scanner(System.in);
    
    public  persegipanjang(){
        this.panjang=panjang;
        this.lebar=lebar;
        
    }

    public void inputan() {
        
        System.out.println("Masukan nilai panjang: ");
        panjang = sc.nextDouble();
        System.out.println("Masukan nilai lebar: ");
        lebar= sc.nextDouble();
    }

    public void luaspj() {
        double luas = panjang*lebar;
        System.out.println("Luas Persegi panjang= " + luas);

    }

    public void kelilingpj() {
        double keliling = 2*(panjang+lebar);
        System.out.println("keliling Persegi Panjang= " + keliling);
    }
}
