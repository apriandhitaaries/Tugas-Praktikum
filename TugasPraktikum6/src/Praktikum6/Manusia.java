package Praktikum6;

import java.text.DecimalFormat;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;
    int jumlah = 0;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if(getJenisKelamin() == true) {
            if(getMenikah() == true) {
                return 25;
            } else {
                return 15;
            }
        } else {
            if(getMenikah() == true) {
                return 20;
            } else {
                return 15;
            }
        }
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public void getTotalManusia(){
        System.out.println(jumlah);
    }

    public String toString() {
        jumlah++;
        String pattern = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return 
        "\n Nama            : " + getNama() +
        "\n NIK             : " + getNIK() +
        "\n Jenis Kelamin   : " + (getJenisKelamin() ? "Laki-laki" : "Perempuan") +
        "\n Pendapatan      : " + getPendapatan() + "$" + "\n";    
    }
}
