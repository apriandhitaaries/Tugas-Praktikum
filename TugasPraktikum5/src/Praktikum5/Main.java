package Praktikum5;

public class Main {
    public static void main(String[] args) {
        CarRider rider1 = new CarRider ("Levi Ackerman", 30, "08000000000");
        CarRider rider2 = new CarRider ("Lelouch Lamperouge", 20, "08111111111");
        CarRider rider3 = new CarRider ("Komi Shouko", 18, "08222222222");
        CarRider rider4 = new CarRider ("Kaori Miyazono", 17, "08333333333");

        CarData data = new CarData();
        data.addCar("SPORT", "N 1111 AB", "Ferrari");
        data.addCar("CONVERTIBLE", "N 2222 AB", "Lamborghini");
        data.addCar("SEDAN", "N 3333 AB", "Honda");
        data.addCar("HATCHBACK", "N 4444 AB", "Toyota");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(rider1, data.getCarList().get(0), 12);
        arsip.Rent(rider2, data.getCarList().get(1), 7);
        arsip.Rent(rider3, data.getCarList().get(2), 3);
        arsip.Rent(rider4, data.getCarList().get(3), 2);

        System.out.println();
        Car.status();

        System.out.println();
        arsip.info();
        
    }
    
}
