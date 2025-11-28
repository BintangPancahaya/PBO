package Pertemuan_8.GameZombie;

public class Tester {
    public static void main(String[] args) {
        // Inisialisasi objek
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        // Tampilkan data awal
        System.out.println("--- DATA AWAL ---");
        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());
        System.out.println("");

        // Lakukan penghancuran berulang kali sampai ada yang kalah
        System.out.println("--- SIMULASI DIMULAI ---");
        int round = 1;
        while (wz.getHealth() > 0 && jz.getHealth() > 0 && b.getStrength() > 0) {
            System.out.println("--- ROUND " + round + " ---");
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
            
            System.out.println(wz.getZombieInfo()+"\n");
            System.out.println(jz.getZombieInfo()+"\n");
            System.out.println(b.getBarrierInfo());
            System.out.println("");
            round++;
        }

        // Tampilkan data akhir dan status kekalahan
        System.out.println("--- SIMULASI SELESAI ---");
        System.out.println("");
        System.out.println("--- DATA AKHIR ---");
        System.out.println(wz.getZombieInfo()+"\n");
        System.out.println(jz.getZombieInfo()+"\n");
        System.out.println(b.getBarrierInfo());
        System.out.println("--------------------");

        // Cek dan tampilkan siapa yang kalah
        if (wz.getHealth() <= 0) {
            System.out.println("Walking Zombie telah kalah!");
        }
        if (jz.getHealth() <= 0) {
            System.out.println("Jumping Zombie telah kalah!");
        }
        if (b.getStrength() <= 0) {
            System.out.println("Barrier telah hancur!");
        }
    }
}