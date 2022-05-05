package Praktikum7;

public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;
    
    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }
    
    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji(double gaji) {
        gaji = penjualan * komisi;
        return gaji;
    }

    @Override
    public String toString() {
        return 
        "\n Sales            : " + getNama() +
        "\n No. KTP          : " + getNoKTP() +
        "\n Total Penjualan  : " + getPenjualan() +
        "\n Komisi           : " + "Rp" + (int)getKomisi() +
        "\n Pendapatan       : " + "Rp" + (int)gaji(penjualan) + 

        super.toString();
    }
}
