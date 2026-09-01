package BikeDemo;

public class Laptop extends Gadget {
    private int ram;
    private String os;

    public void setSpek(int ram, String os) {
        this.ram = ram;
        this.os = os;
    }

    public void buka(String aplikasi) {
        System.out.println("Membuka " + aplikasi + " di laptop.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("RAM : " + ram + " GB");
        System.out.println("OS  : " + os);
    }
}