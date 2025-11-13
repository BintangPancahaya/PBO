package Pertemuan_2;

public class Peminjaman {
    String id, namaMember, namaGame;
    double harga;
    int lamaSewa;

    Peminjaman(String id, String namaMember, String namaGame, double harga, int lamaSewa){
        this.id = id;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.harga = harga;
        this.lamaSewa = lamaSewa;
    }

    double hitungHarga(){
        return lamaSewa*harga;
    }

    void cetakInfo(){
        System.out.println("ID Member       : "+id);
        System.out.println("Nama Member     : "+namaMember);
        System.out.println("Nama Game       : "+namaGame);
        System.out.println("Lama Penyewaan  : "+lamaSewa+" hari");
        System.out.println("Harga per hari  : Rp."+harga);
        System.out.println("Total Harga     : Rp."+hitungHarga());
    }

}
