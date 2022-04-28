package Praktikum6;

public class test {
    public static void main(String[] args) {
        double gaji = 15;
        double hariKerja = 21;
        double jamKerja = 7;

        if (jamKerja > 7 || hariKerja > 20) {
            double bonuslembur = 20 * (jamKerja - 7) * 7;
            double bonuslibur = (hariKerja - 20) * jamKerja * 20;
            double bonus = bonuslembur + bonuslibur;
            System.out.println(bonus);
        } else if (jamKerja > 7 || hariKerja < 20) {
            double bonuslembur = 20 * (jamKerja - 7) * 7;
            double bonuslibur = 0;
            double bonus = bonuslembur + bonuslibur;
            System.out.println(bonus);
        } else if (jamKerja < 7 || hariKerja > 20) {
            double bonuslembur = 0;
            double bonuslibur = (hariKerja - 20) * jamKerja * 20;
            double bonus = bonuslembur + bonuslibur;
            System.out.println(bonus);
        } else {
            double bonuslembur = 0;
            double bonuslibur = 0;
            double bonus = bonuslembur + bonuslibur;
            System.out.println(bonus);
        }
    }
}
