package Jobsheet4.TugasMandiri;

public class Pustakawan {
    private String nip;
    private String nama;

    public Pustakawan(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        return "NIP: " + nip + ", Nama: " + nama;
    }
}
