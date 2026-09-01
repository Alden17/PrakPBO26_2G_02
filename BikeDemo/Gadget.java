package BikeDemo;

public class Gadget {
    private String merk;
    private boolean hidup;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void nyalakan() {
        hidup = true;
        System.out.println(merk + " dinyalakan.");
    }

    public void printInfo() {
        System.out.println("Merk    : " + merk);
        System.out.println("Status : " + (hidup ? "Hidup" : "Mati"));
    }
}