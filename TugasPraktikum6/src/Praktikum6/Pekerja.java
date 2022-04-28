package Praktikum6;

import java.text.DecimalFormat;

public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji(){
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja(){
        return jamKerja;
    }
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja(){
        return hariKerja;
    }
    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public double gajiPokok(){
        setGaji(15);
        return (getHariKerja() * getJamKerja() * getGaji());
    }

    public double gajiBonus(){
        if (getJamKerja() > 7 || getHariKerja() > 20) {
            double bonuslembur = 20 * (getJamKerja() - 7) * 7;
            double bonuslibur = (getHariKerja() - 20) * getJamKerja() *20;
            return bonuslembur + bonuslibur;
        } else if (getJamKerja() > 7 || getHariKerja() < 20) {
            double bonuslembur = 20 * (getJamKerja() - 7) * 7;
            double bonuslibur = 0;
            return bonuslembur + bonuslibur;
        } else if (getJamKerja() < 7 || getHariKerja() > 20) {
            double bonuslembur = 0;
            double bonuslibur = (getHariKerja() - 20) * getJamKerja() *20;
            return bonuslembur + bonuslibur;
        } else {
            return 0;
        }
    }

    public String getStatus(){
        String kantor = "";
        String departemen = "";
        String cabang;
        switch (NIP.substring(0,1)){
            case "1" :
                    kantor = "Mondstadt";
                break;
            case "2" :
                    kantor = "Liyue";
                break;
            case "3" :
                    kantor = "Inazuma";
                break;
            case "4" :
                    kantor = "Sumeru";
                break;
            case "5" :
                    kantor = "Fontaine";
                break;
            case "6" :
                    kantor = "Natlan";
                break;
            case "7" :
                    kantor = "Snezhnaya";
                break;
        }
        cabang = " cabang ke- " + NIP.substring(2,3);
        switch (NIP.substring(6,7)){
            case "1" :
                    departemen = "Pemasaran";
                break;
            case "2" :
                    departemen = "Humas";
                break;
            case "3" :
                    departemen = "Riset";
                break;
            case "4" :
                    departemen = "Teknologi";
                break;
            case "5" :
                    departemen = "Personalia";
                break;
            case "6" :
                    departemen = "Akademik";
                break;
            case "7" :
                    departemen = "Administrasi";
                break;
            case "8" :
                    departemen = "Operasional";
                break;
            case "9" :
                    departemen = "Pembangunan";
                break;
        }
        return departemen + ", "+ kantor + cabang;
    }

    public String toString(){
        jumlah++;
        String pattern = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return
        "\nNama             : " + getNama() +
        "\nNIK              : " + getNIK() +
        "\nJenis Kelamin    : " + (getJenisKelamin()?"Laki-laki" : "Perempuan") +
        "\nPendapatan       : " + (getPendapatan() + gajiPokok() + gajiBonus()) + "$" +
        "\nBonus            : " + gajiBonus() + "$" +
        "\nGaji             : " + gajiPokok() + "$" +
        "\nStatus           : " + getStatus() + "\n";

    }
}
