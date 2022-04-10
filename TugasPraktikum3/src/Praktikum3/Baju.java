package Praktikum3;

public class Baju {
    String jenis;
    int jumlah;
    int harga;
     
    public Baju(String jenis, int jumlah){
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    final int baju_A = 100000;
    final int baju_B = 125000;
    final int baju_C = 175000;

    void harga_A(){
        if (jumlah > 100){
            harga = 95000;
        } else {
            harga = baju_A; 
        }
    }
    void harga_B(){
        if (jumlah > 100){
            harga = 120000;
        } else {
            harga = baju_B; 
        }

    }
    void harga_C(){
        if (jumlah > 100){
            harga = 160000;
        } else {
            harga = baju_C; 
        }
    }

    void output(){
        if (jenis.equalsIgnoreCase("a")){
            harga_A();
        } else if (jenis.equalsIgnoreCase("b")){
            harga_B();
        } else if (jenis.equalsIgnoreCase("c")){
            harga_C();
        }

        System.out.println("Jenis yang ingin anda beli  : " + jenis);
        System.out.println("Harga per buah              : " + harga);
        System.out.println("Total harga                 : " + harga * jumlah);
    }


    

}