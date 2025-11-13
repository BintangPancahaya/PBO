package Pertemuan_1.TugasDemo;

public class Demo {
    public static void main(String[] args) {
        Microphone mic = new Microphone("Noir Voix", false);
        Mouse mouse = new Mouse("Fantech", 1600);
        KipasAnginDinding kipasDinding = new KipasAnginDinding("Panasonic", 3, true);
        KipasAnginBerdiri kipasBerdiri = new KipasAnginBerdiri("Miyako", 2, 100);

        mic.nyalakan();
        mic.aturVolume(80);
        mic.cetakInfo();
        System.out.println();

        mouse.klikKiri();
        mouse.aturDpi(800);
        mouse.cetakInfo();
        System.out.println();

        kipasDinding.nyalakan();
        kipasDinding.pasangDinding();
        kipasDinding.cetakInfo();
        kipasDinding.matikan();
        System.out.println();

        kipasBerdiri.nyalakan();
        kipasBerdiri.aturTinggi(80);
        kipasBerdiri.cetakInfo();
        kipasBerdiri.matikan();
    }
}
