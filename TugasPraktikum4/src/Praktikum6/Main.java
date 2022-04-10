package Praktikum6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Apriandhita Aries Prayoga");
        System.out.println("NIM     : 215150607111019 \n");
        System.out.print("Masukkan restoran yang anda pilih      : ");
        String restoran = DataMerchant.input.nextLine();
        System.out.print("Masukkan makanan yang anda pilih       : ");
        String makanan = DataMerchant.input.nextLine();
        System.out.print("Masukkan harga makanan yang anda pilih : ");
        int harga = DataMerchant.input.nextInt();
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(restoran, makanan, harga));
        System.out.println("");
        DataMerchant.tampilData();

    }
    
}