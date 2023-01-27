/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.*;

/**
 *
 * @author
 */
public class Tampilprogam {
    Pbo Pbo=new Pbo();
    segitiga segitiga=new segitiga();
    persegi persegi=new persegi();
    persegipanjang persegipanjang=new persegipanjang();
    jajargenjang jajargenjang=new jajargenjang();
    
    public Tampilprogam(){
        this.Pbo=Pbo;
        this.segitiga=segitiga;
        this.persegi=persegi;
        this.persegipanjang=persegipanjang;
        this.jajargenjang=jajargenjang;
        
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ulang = 1;
        while (ulang == 1) {
            System.out.print("1. Lingkaran\n2. Segitiga\n3. Persegi\n4. Persegi Panjang\n5. Jajar Genjang\n-> ");
            int inputtan = inp.nextInt();
            switch (inputtan) {
                case 1:
                    Pbo ling = new Pbo();
                    ling.kelilingLingkaran(17);
                    ling.luasLingkaran(171
                    );
                    break;
                case 2:
                    segitiga seg = new segitiga();
                    seg.inputan();
                    seg.KelilingSegitiga();
                    seg.luasSegitiga();
                    break;
                case 3:
                    persegi per = new persegi();
                    per.inputan();
                    per.kelilingPersegi();
                    per.luasPersegi();
                    break;
                case 4:
                    persegipanjang pj = new persegipanjang();
                    pj.inputan();
                    pj.kelilingpj();
                    pj.luaspj();
                    break;
                case 5:
                    jajargenjang jg = new jajargenjang();
                    jg.Input();
                    jg.LuasJajar();
                    jg.KelilingJajar();
                    break;
            }
            System.out.print("Ulangi? (y/n)");
            
            String jaw = inp.next();
            
            if(jaw.equalsIgnoreCase("n")){
                ulang=0;
            }
        }

    }
}
