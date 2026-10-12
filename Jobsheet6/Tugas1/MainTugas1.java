package Jobsheet6.Tugas1;

public class MainTugas1 {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(5);

        Pegawai p = new Pegawai("P001", "Budi", "Malang");
        Dosen d = new Dosen("D001", "Siti", "Surabaya", 12);

        daftar.addPegawai(p);
        daftar.addPegawai(d);
        daftar.printSemuaGaji();
    }
}
