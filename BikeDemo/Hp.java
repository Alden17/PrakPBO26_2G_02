package BikeDemo;

public class Hp extends Gadget {
    private int kamera;
    private int memori;

    public void setSpek(int kamera, int memori) {
        this.kamera = kamera;
        this.memori = memori;
    }

    public void foto() {
        System.out.println("Mengambil foto dengan kamera " + kamera + " MP.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Kamera  : " + kamera + " MP");
        System.out.println("Memori  : " + memori + " GB");
    }
}
