/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pbo {
    Scanner sc = new Scanner(System.in);
    int jari;
    int phi;
    
    public Pbo()
    {
        this.jari=jari;
        this.phi=phi;
    }

    public void inputan() {
        
        System.out.println("Masukan nilai jari: ");
        jari = sc.nextInt();
    }
    

    public void luasLingkaran(int jari) {
        double luasLingkaran = phi * jari * jari;
        System.out.println("Luas lingkaran= " + luasLingkaran);

    }

    public void kelilingLingkaran(int jari) {
        double keliling = (2 * jari) * phi;
        System.out.println("keliling lingkaran= " + keliling);
    }
}
