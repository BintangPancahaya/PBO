package Inheritance_1;

import java.util.ArrayList;

public class DaftarGaji {
    private ArrayList<Pegawai> listPegawai;

    public DaftarGaji() {
        listPegawai = new ArrayList<>();
    }

    public void addPegawai(Pegawai p) {
        listPegawai.add(p);
    }

    public void printSemuaGaji() {
        System.out.println("=== DAFTAR GAJI PEGAWAI ===");
        for (Pegawai p : listPegawai) {
            System.out.println("Nama   : " + p.getNama());
            System.out.println("Gaji   : Rp " + p.getGaji());
            System.out.println("---------------------------");
        }
    }
}