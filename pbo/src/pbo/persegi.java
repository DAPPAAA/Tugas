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
public class persegi {

    double sisi;
    Scanner sc = new Scanner(System.in);
    public persegi(){
        this.sisi=sisi;
    }

    public void inputan() {

        System.out.println("Masukan sisi: ");
        sisi = sc.nextDouble();
    }

    public void luasPersegi() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi= " + luas);

    }

    public void kelilingPersegi() {
        double keliling = 4 * sisi;
        System.out.println("keliling Persegi= " + keliling);
    }
}
