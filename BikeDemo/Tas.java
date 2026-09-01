package BikeDemo;

public class Tas {
    private String merk;
    private int kapasitas;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void tambahBarang(String barang) {
        System.out.println(barang + " dimasukkan ke tas.");
    }

    public void printInfo() {
        System.out.println("Merk      : " + merk);
        System.out.println("Kapasitas : " + kapasitas + " liter");
    }
}
