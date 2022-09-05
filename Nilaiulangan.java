/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author daff9
 */
public class Tugas1 {

   
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Masukan nilai");
         int nilai;
        nilai=as.nextInt();
        if (nilai>=75){
            System.out.println("Selamat! Anda Lolos");
        } else if (nilai <=70){
            System.out.println("Anda harus Remedi ");
       
        }
        System.out.println("Yang Lolos jangan Sombong Dulu");
        System.out.println("Untuk Yang Gagal jgn patah semangat");
}

}

