import java.io.*;
import java.util.*;

public class Menghitung_luas {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int menu = input.nextInt();

        switch (menu){
            case 1 :
                int sisi = input.nextInt();
                persegi persegi = new persegi(sisi);
                persegi.output();
                break;
            case 2 :
                int alas = input.nextInt();
                int tinggi = input.nextInt();
                segitiga segitiga = new segitiga (alas, tinggi);
                segitiga.output();
                break;
            case 3 :
                int jarijari = input.nextInt();
                lingkaran lingkaran = new lingkaran(jarijari);
                lingkaran.output();
                break;
            default :
                System.out.println("Input yang anda masukan tidak sesuai");
                break; 
        }
        input.close();   
    }
}

class persegi {
    int sisi;
    int luas;
    
    persegi(int sisi){
        this.sisi = sisi;
    }

    void output(){
        luas = sisi * sisi;
        System.out.println(luas);
    }
}

class segitiga {
    int alas;
    int tinggi;
    int luas;

    segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    void output(){
        luas = alas * tinggi / 2;
        System.out.println(luas);
    }
}

class lingkaran {
    int jarijari;
    double luas;

    lingkaran(int jarijari){
        this.jarijari = jarijari;
        
    }

    void output(){
        if (jarijari % 7 == 0){
            luas = 22/7 * jarijari * jarijari;
        } else {
            luas = 3.14 * jarijari * jarijari;
        }

        System.out.println((double) (int) luas);
    }    
}
  
    

