package Inheritance_1;

public class Dosen extends Pegawai {
    private int jumlahSKS;
    private int tarifSKS = 120000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    public int getGaji() {
        return this.jumlahSKS * tarifSKS;
    }
}