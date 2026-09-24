package Jobsheet4.TugasMandiri;

public class Rak {
    private String kodeRak;
    private Buku[] daftarBuku;

    public Rak(String kodeRak) {
        this.kodeRak = kodeRak;
        this.daftarBuku = new Buku[2];
        initBuku();
    }

    private void initBuku() {
        daftarBuku[0] = new Buku("Pemrograman Java", "Budi Santoso");
        daftarBuku[1] = new Buku("Dasar Basis Data", "Andi Wijaya");
    }

    public String getKodeRak() {
        return kodeRak;
    }

    public String info() {
        String info = "";
        info += "Kode Rak: " + kodeRak + "\n";

        for (Buku buku : daftarBuku) {
            info += "Buku: " + buku.info() + "\n";
        }

        return info;
    }
}

