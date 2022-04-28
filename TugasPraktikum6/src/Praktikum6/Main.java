package Praktikum6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Apriandhita Aries Prayoga");
        System.out.println("NIM     : 215150607111019");
        System.out.println();
        Manusia manusia1 = new Manusia("Tabibito", "3576020504030001", true, false);
        Manusia manusia2 = new Manusia("Ayaka", "3576012809030002", false, false);
        Manusia manusia3 = new Manusia("Keqing", "3576032610030003", false, true);
        ArrayList<Manusia> output = new ArrayList<Manusia>();
        output.add(manusia1);
        output.add(manusia2);
        output.add(manusia3);
    
        System.out.println("==========|| DAFTAR MANUSIA ||===========");
            for(int i = 0; i < output.size(); i++){
                System.out.println(output.get(i).toString());
            }
        System.out.println("=========================================");
    
        MahasiswaFilkom mahasiswa1 = new MahasiswaFilkom("Xiao", "3576021704030003", true, false, "215150207111019", 3.8);
        MahasiswaFilkom mahasiswa2 = new MahasiswaFilkom("Itto", "3576010106030001", true, false, "215150607111014", 3.7);
        MahasiswaFilkom mahasiswa3 = new MahasiswaFilkom("Diluc", "3576033004020004", true, false, "215150701111022", 3.9);
        ArrayList<MahasiswaFilkom> output1 = new ArrayList<MahasiswaFilkom>();
        output1.add(mahasiswa1);
        output1.add(mahasiswa2);
        output1.add(mahasiswa3);
    
        System.out.println();
        System.out.println("======|| DAFTAR MAHASISWA FILKOM ||======");
            for(int i = 0; i < output1.size(); i++){
                System.out.println(output1.get(i).toString());
            }
        System.out.println("=========================================");
    
        Pekerja pekerja1 = new Pekerja("Ayato", "3576032603020001", true, true, 7, 22, "301777844433");
        Pekerja pekerja2 = new Pekerja("Ganyu", "3576030212020004", false, true, 8, 24, "202777731234");
        Pekerja pekerja3 = new Pekerja("Albedo", "3576031309020004", true, false, 9, 26, "103771413465");
        ArrayList<Pekerja> output2 = new ArrayList<Pekerja>();
        output2.add(pekerja1);
        output2.add(pekerja2);
        output2.add(pekerja3);
    
        System.out.println();
        System.out.println("==========|| DAFTAR PEKERJA ||===========");
            for(int i = 0; i < output2.size(); i++){
                System.out.println(output2.get(i).toString());
            }
        System.out.println("=========================================");
    
        Manajer manajer1 = new Manajer("Zhongli", "3576033112020003", true, true,9, 26,"201777244433", 7000);
        Manajer manajer2 = new Manajer("Ei", "3576032606020004", false,false,8, 24,"302777831234", 1500);
        Manajer manajer3 = new Manajer("Venti", "3576031606020004", true, true,7, 22,"103771313465", 4000);
        ArrayList<Manajer> output3 = new ArrayList<Manajer>();
        output3.add(manajer1);
        output3.add(manajer2);
        output3.add(manajer3);
    
        System.out.println();
        System.out.println("===========|| DAFTAR MANAJER ||==========");
            for(int i = 0; i < output3.size(); i++){
                System.out.println(output3.get(i).toString());
            }
        System.out.println("=========================================");
    
        }
    }
    

