package Praktikum5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        System.out.print("Baju yang akan anda beli bertipe : ");
        String jenis = input.nextLine();
        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        int jumlah = input.nextInt();
        
        Baju baju = new Baju(jenis, jumlah);
        baju.output();

        input.close();


    }
    
}
