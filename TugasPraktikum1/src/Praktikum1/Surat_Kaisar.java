package Praktikum1;

import java.io.*;
import java.util.*;

public class Surat_Kaisar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata = input.nextLine();
        int angka = input.nextInt();
        System.out.println(pergeseranHuruf(kata, angka)); 
        input.close();       
    }

    static String pergeseranHuruf(String kata, int angka){
        String suratKaisar = ""; 
        for(int i = 0; i < kata.length(); i++){
            char huruf = kata.charAt(i);
            if (huruf >= 'a' && huruf <= 'z'){
                huruf = (char) (huruf + angka);
                if(huruf > 'z'){
                    huruf = (char) (huruf + 'a' - 'z' - 1);
                } 
                suratKaisar += huruf;

            } else if (huruf >= 'A' && huruf <= 'Z'){
                huruf = (char) (huruf + angka);
                if(huruf > 'Z'){
                    huruf = (char) (huruf + 'A' - 'Z' - 1);
                } 
                suratKaisar += huruf;

            } else {
                suratKaisar += huruf;
            }

        }
        return suratKaisar;

    }
    
}
