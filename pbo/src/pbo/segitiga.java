 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;


public class segitiga {
    int alas;
    int tinggi;
    int sisimiring = 2;
    Scanner sc=new Scanner (System.in);
    
    public segitiga(){
        this.alas=alas;
        this.tinggi=tinggi;
        this.sisimiring=2;
        
    }
    
    
    public void inputan(){
        System.out.println("Masukan alas: ");
        alas =sc.nextInt();
        System.out.println("Masukan tinggi: ");
        tinggi = sc.nextInt();
        
    }
        
    
    public void luasSegitiga(){
        double luas =0.5*alas*tinggi;
        System.out.println("luas segitiga= "+luas);
    }
    public  void KelilingSegitiga(){
        double keliling = alas+sisimiring+sisimiring;
        System.out.println("keliling segitiga= "+keliling);
        
    
    }
}
