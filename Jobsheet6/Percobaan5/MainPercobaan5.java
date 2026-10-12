package Jobsheet6.Percobaan5;

public class MainPercobaan5 {
    public static void main(String[] args) {
        Desktop desk = new Desktop("Dell", 2048, 3500, "Canon");
        Laptop lap = new Laptop("Asus", 4096, 2500, 720);
        Workstation workstation = new Workstation("HP", 8192, 4000, "Epson", "NVIDIA RTX 3080");

        desk.showInfo();
        System.out.println();
        lap.showInfo();
        System.out.println();
        desk.nyalakanKomputer();
        System.out.println();
        workstation.showInfo();
    }
}
