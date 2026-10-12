package Jobsheet6.Tugas2;

public class Televisi {
    private int channelAktif = 1;
    protected int jumlahChannel;
    protected String merk;

    public Televisi(String merk, int jumlahChannel) {
        this.merk = merk;
        this.jumlahChannel = jumlahChannel;
    }

    public int getChannelAktif() {
        return channelAktif;
    }

    public void pindahChannel(int channel) {
        if (channel >= 1 && channel <= jumlahChannel) {
            channelAktif = channel;
        }
    }
}
