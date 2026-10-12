package Jobsheet6.Tugas2;

public class TelevisiModern extends Televisi {
    private String modusTampilan;
    private String judulDVD = "";

    public TelevisiModern(String merk, int jumlahChannel) {
        super(merk, jumlahChannel);
    }

    public void gantiModusTampilan(String modus) {
        modusTampilan = modus;
    }

    public void masukkanDVD(String judul) {
        judulDVD = judul;
    }

    public void mainkanDVD() {
        String judul = judulDVD.isEmpty() ? "kosong" : judulDVD;
        System.out.println("Sedang memainkan DVD: " + judul);
    }
}
