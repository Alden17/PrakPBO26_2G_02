package Jobsheet3;
import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin ditambahkan: ");
        double tambah = alden.nextDouble();

        kontainerAlfa.tambahMuatan(tambah);

        System.out.println("Berat muatan saat ini: " 
                + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin diturunkan: ");
        double turun = alden.nextDouble();

        kontainerAlfa.turunkanMuatan(turun);

        System.out.println("Berat muatan saat ini: " 
                + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
    }
}
