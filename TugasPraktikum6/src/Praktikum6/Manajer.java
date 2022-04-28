package Praktikum6;

import java.text.DecimalFormat;

public class Manajer extends Pekerja {
    public int lamaKerja;

    public Manajer(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP, int lamaKerja) {
        super(nama, NIK, jenisKelamin, menikah, jamKerja, hariKerja, NIP);
        this.lamaKerja = lamaKerja;
    }
    
    public int getLamaKerja(){
        return lamaKerja;
    }
    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public double bonusManajer(){
        double bonusManajer = gajiBonus() * 30/100;
        return gajiBonus() + bonusManajer;
    }

    public String toString(){
        jumlah++;
        String pattern = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return
        "\nNama             : " + getNama() +
        "\nNIK              : " + getNIK() +
        "\nJenis Kelamin    : " + (getJenisKelamin()?"Laki-laki" : "Perempuan") +
        "\nPendapatan       : " + (getPendapatan() + gajiBonus() + bonusManajer() + gajiPokok() + 15) + "$" +
        "\nBonus            : " + bonusManajer() + "$" +
        "\nGaji             : " + gajiPokok() + "$" +
        "\nStatus           : " + getStatus() +
        "\nLama Kerja       : " + getLamaKerja() + " hari" + "\n";

    }


}

