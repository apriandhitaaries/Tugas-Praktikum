package Praktikum7;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }
    
    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji(double gaji) {
        if(getTotalJam() <= 40){
            gaji = getUpahPerJam() * getTotalJam(); 
        } else {
            gaji = ((getUpahPerJam() * 40) + getTotalJam() - 40) * getUpahPerJam() * 1.5;
        }
        return gaji;
    }

    @Override
    public String toString() {
        return
        "\n Pegawai Harian   : " + getNama() +
        "\n No. KTP          : " + getNoKTP() +
        "\n Upah/jam         : " + "Rp" + (int)getUpahPerJam() +
        "\n Total Jam        : " + getTotalJam() +
        "\n Pendapatan       : " + "Rp" + (int)gaji(upahPerJam) + 
        super.toString();
    }

}
