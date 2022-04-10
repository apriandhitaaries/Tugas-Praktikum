import java.io.*;
import java.util.*;

public class Saldo_Nasabah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldoAwal = input.nextDouble();
        double setorTunai = input.nextDouble();

        jumlahSaldo(saldoAwal, setorTunai);
        input.close();
        
    }

    static void jumlahSaldo(double saldoAwal, double setor){
        double admin = 7000;
        double saldo = saldoAwal + setor - admin;
        double bunga = saldo * (0.05 / 100);
        double saldoAkhir = saldo + bunga;
        System.out.println(saldoAkhir);

    }
    
}
