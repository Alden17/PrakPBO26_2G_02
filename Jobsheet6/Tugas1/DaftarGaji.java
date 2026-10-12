package Jobsheet6.Tugas1;

public class DaftarGaji {
    private Pegawai[] daftar;
    private int jumlah;

    public DaftarGaji(int kapasitas) {
        daftar = new Pegawai[kapasitas];
        jumlah = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (jumlah < daftar.length) {
            daftar[jumlah] = pegawai;
            jumlah++;
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < jumlah; i++) {
            System.out.println(daftar[i].nama + " : " + daftar[i].getGaji());
        }
    }
}
