package Jobsheet4.TugasMandiri;

public class TugasMandiriMain {  
    public static void main(String[] args) {
        Pustakawan pustakawan = new Pustakawan("P001", "Alden");

        Perpustakaan perpustakaan = new Perpustakaan(
            "Perpustakaan Polinema",
            pustakawan
        );

        perpustakaan.tampilkanInfo();

        Printer printer = new Printer("Epson L3110");
        perpustakaan.cetakLaporan(printer);
    }
}

