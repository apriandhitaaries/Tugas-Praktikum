package Tugas1;

public class pemainSepakBola {
    String nama;
    int umur;
    String asalNegara;
    String klubSaatIni;
    
    String getNama(){
        return nama;
    }

    int getUmur(){
        return umur;
    }

    String getAsalNegara(){
        return asalNegara;
    }

    String getKlubSaatIni(){
        return klubSaatIni;
    }


    pemainSepakBola(String nama, int umur, String asalNegara, String klubSaatIni){
        this.nama = nama;
        this.umur = umur;
        this.asalNegara = asalNegara;
        this.klubSaatIni = klubSaatIni;

    }

    void output(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur);
        System.out.println("Asal negara : " + this.asalNegara);
        System.out.println("Klub saat ini : " + this.klubSaatIni);
        System.out.println();
    }


}