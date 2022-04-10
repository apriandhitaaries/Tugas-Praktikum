package Praktikum1;

import java.io.*;
import java.util.*;

public class Menghitung_Luas {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int menu = input.nextInt();

        switch (menu){
            case 1 :
                int sisi = input.nextInt();
                System.out.println(luasPersegi(sisi));
                break;
            case 2 :
                int alas = input.nextInt();
                int tinggi = input.nextInt();
                System.out.println(luasSegitiga(alas, tinggi));
                break;
            case 3 :
                int jarijari = input.nextInt();
                System.out.println((double) (int) luasLingkaran(jarijari));
                break;
            default :
                System.out.println("Input yang anda masukan tidak sesuai");
                break; 
        }
        
        input.close();
        
    }

    static int luasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    static int luasSegitiga(int alas, int tinggi) {
        int luas = alas * tinggi / 2;
        return luas;
    }

    static double luasLingkaran(int jarijari) {
        if(jarijari % 7 == 0){
            double luas = 22/7 * jarijari * jarijari;
            return luas;
        } else {
            double luas = 3.14 * jarijari * jarijari;
            return luas;
        }
    }
    
}
