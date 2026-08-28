package BikeDemo;

public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBikel = new Bike();
        Bike mountainBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();

        mountainBikel.setBrand("Trek");
        mountainBikel.speedAcceleration(10);
        mountainBikel.gearChanges(2);
        mountainBikel.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.speedAcceleration(15);
        roadBike1.gearChanges(4);
        roadBike1.printInfo();
    }
}
