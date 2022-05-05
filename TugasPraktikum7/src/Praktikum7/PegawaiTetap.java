package Praktikum7;

public class PegawaiTetap extends Pegawai {
    private double upah;
    
    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public double gaji(double gaji) {
        gaji = getUpah();
        return gaji;
    }

    @Override
    public String toString() {
        return 
        "\n Pegawai Tetap    : " + getNama() +
        "\n No. KTP          : " + getNoKTP() +
        "\n Upah             : " + (int)getUpah() +
        "\n Pendapatan       : " + "Rp" + (int)gaji(upah) +

        super.toString();
    }
}
