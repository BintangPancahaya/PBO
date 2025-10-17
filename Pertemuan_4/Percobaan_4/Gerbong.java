package Tugas.Pertemuan_4.Percobaan_4;

public class Gerbong {
    private String kode;
    private Kursi arrayKursi[];

    Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    private void initKursi(){
        for(int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getKode() {
        return kode;
    }
    public void setPenumpang(Penumpang penumpang, int nomor){
    if (nomor >= 1 && nomor <= this.arrayKursi.length) {
        int index = nomor - 1;

        if (this.arrayKursi[index].getPenumpang() == null) {
            this.arrayKursi[index].setPenumpang(penumpang);
            System.out.println("Penumpang " + penumpang.getNama() + " berhasil duduk di kursi " + nomor);
        } else {
            System.out.println("Maaf, kursi nomor " + nomor + " sudah terisi.");
        }
    } else {
        System.out.println("Maaf, nomor kursi tidak valid.");
    }
    }
    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }
    public String info(){
        String info = "";
        info += "Kode: "+kode+"\n";
        for (Kursi kursi : arrayKursi){
            info += kursi.info();
        }
        return info;
    }
}
