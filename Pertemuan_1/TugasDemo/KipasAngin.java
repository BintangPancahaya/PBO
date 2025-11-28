package Pertemuan_1.TugasDemo;

public class KipasAngin {
    private String merk;
    private int kecepatan;

    KipasAngin(String merk, int kecepatan){
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    public String getMerk(){
        return merk;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }

    void nyalakan(){
        System.out.println("Kipas "+merk+" dinyalakan pada kecepatan "+kecepatan);
    }

    void matikan(){
        System.out.println("Kipas "+merk+" dimatikan");
    }

    void cetakInfo(){
        System.out.println("[Kipas Angin] Merk: "+merk+", Kecepatan: "+kecepatan+" RPM");
    }
}
