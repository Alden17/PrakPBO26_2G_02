package BikeDemo;

public class Magicom {
    private String merk;
    private boolean nyala;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void masak() {
        nyala = true;
        System.out.println(merk + " sedang memasak nasi.");
    }

    public void printInfo() {
        System.out.println("Merk   : " + merk);
        System.out.println("Status : " + (nyala ? "Nyala" : "Mati"));
    }
}