package Jobsheet4.TugasMandiri;

public class Printer {
    private String merk;

    public Printer(String merk) {
        this.merk = merk;
    }

    public void cetak(String laporan) {
        System.out.println("[" + merk + "] Mencetak laporan...");
        System.out.println(laporan);
        System.out.println("[" + merk + "] Selesai.");
    }
}
