package Pertemuan_1.TugasDemo;

public class KipasAnginBerdiri extends KipasAngin{
    private int tinggiMaks;

    KipasAnginBerdiri(String merk, int kecepatan, int tinggiMaks){
        super(merk, kecepatan);
        this.tinggiMaks = tinggiMaks;
    }

    public int getTinggiMaks(){
        return tinggiMaks;
    }

    public void setTinggiMaks(int tinggiMaks){
        this.tinggiMaks = tinggiMaks;
    }

    void aturTinggi(int tinggi){
        if (tinggi > tinggiMaks){
            System.out.println("Tinggi maksimal kipas "+getMerk()+" adalah "+tinggiMaks+" cm");
        } else {
            System.out.println("Tinggi kipas diatur menjadi "+tinggi+" cm");
        }
    }

    void cetakInfo(){
        System.out.println("[Kipas Angin Berdiri] Merk: "+getMerk()+", Kecepatan: "+getKecepatan()+", Tinggi Maks: "+tinggiMaks+" cm");
    }
}
