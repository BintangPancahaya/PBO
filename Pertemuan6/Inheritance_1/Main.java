package Inheritance_1;

public class Main {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji();

        Pegawai staf1 = new Pegawai("P001", "Andi", "Jl. Merdeka No. 10");
        
        Dosen dosen1 = new Dosen("D001", "Budi Santoso", "Jl. Pendidikan No. 5");
        dosen1.setSKS(18);

        Dosen dosen2 = new Dosen("D002", "Citra Dewi", "Jl. Cendekia No. 12");
        dosen2.setSKS(20); 

        daftar.addPegawai(staf1);
        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);

        daftar.printSemuaGaji();
    }
}