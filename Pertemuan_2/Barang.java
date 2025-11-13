package Pertemuan_2;

public class Barang {
    String kode, namaBarang;
    int hargaDasar;
    float diskon;

    Barang(String kode, String namaBarang, int hargaDasar, float diskon){
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }
    int hitungHargaJual(){
        return hargaDasar-((int)diskon*hargaDasar/100);
    }

    void tampilData(){
        System.out.println("Kode        : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : Rp."+hargaDasar);
        System.out.println("Diskon      : "+diskon+"%");
        System.out.println("Harga Jual  : Rp."+hitungHargaJual());
    }
}
