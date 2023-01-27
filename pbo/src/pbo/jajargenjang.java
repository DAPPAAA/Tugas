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
public class jajargenjang {

    int alas, tinggi, sm;
    Scanner inp = new Scanner(System.in);
    
    public jajargenjang(){
        this.alas=alas;
        this.tinggi=tinggi;
        this.sm=sm;
    }

    public void Input() {
        System.out.print("Masukkan Alas: ");
        alas = inp.nextInt();
        System.out.print("Masukkan Tinggi: ");
        tinggi = inp.nextInt();
        System.out.print("Masukkan Sisi Miring: ");
        sm = inp.nextInt();
    }

    public void LuasJajar() {
        int luas = alas * tinggi;
        System.out.println("Luas Jajar Genjang: " + luas);
    }

    public void KelilingJajar() {
        int kel = 2 * (alas + sm);
        System.out.println("Keliling Jajar Genjang: " + kel);
    }
}
