package Jobsheet4.TugasMandiri;

public class Perpustakaan {
    private String nama;
    private Pustakawan pustakawan;
    private Rak rak;

    public Perpustakaan(String nama, Pustakawan pustakawan) {
        this.nama = nama;
        this.pustakawan = pustakawan;
        this.rak = new Rak("R01");
    }

    public void tampilkanInfo() {
        System.out.println("Nama Perpustakaan: " + nama);
        System.out.println("Pustakawan: " + pustakawan.info());
        System.out.println(rak.info());
    }

    public void cetakLaporan(Printer printer) {
        String laporan = "Laporan Perpustakaan\n";
        laporan += "Nama: " + nama + "\n";
        laporan += "Pustakawan: " + pustakawan.getNama() + "\n";
        laporan += rak.info();

        printer.cetak(laporan);
    }
}

