package Praktikum7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Apriandhita Aries Prayoga");
        System.out.println("Kelas   : PTI-C");
        System.out.println();
        Pegawai pegawaiTetap1 = new PegawaiTetap("Loid", "3576020504030001", 5000000);
        Pegawai pegawaiTetap2 = new PegawaiTetap("Anya", "3576012809030002", 3000000);
        Pegawai pegawaiTetap3 = new PegawaiTetap("Yor", "3576032610030003", 2000000);

        Pegawai pegawaiHarian1 = new PegawaiHarian("Saitama", "3576020504030001", 8500, 40);
        Pegawai pegawaiHarian2 = new PegawaiHarian("Genos", "3576012809030002", 9000, 35);
        Pegawai pegawaiHarian3 = new PegawaiHarian("Tatsumaki", "3576032610030003", 9500, 30);

        Pegawai sales1 = new Sales("Arima", "3576020504030001", 50, 40000);
        Pegawai sales2 = new Sales("Kaori", "3576012809030002", 90, 50000);
        Pegawai sales3 = new Sales("Watari", "3576032610030003", 75, 30000);

        ArrayList<Pegawai> output =new ArrayList<Pegawai>();

        output.add(pegawaiTetap1);
        output.add(pegawaiTetap2);
        output.add(pegawaiTetap3);
        output.add(pegawaiHarian1);
        output.add(pegawaiHarian2);
        output.add(pegawaiHarian3);
        output.add(sales1);
        output.add(sales2);
        output.add(sales3);

        System.out.println("==========|| DAFTAR PEGAWAI ||===========");
    
        for(int i = 0; i < output.size(); i++){
            System.out.println(output.get(i).toString());
        }
        System.out.println("=========================================");
    }
}
