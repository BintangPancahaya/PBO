package Inheritance_2;

public class Main {
    public static void main(String[] args) {
        Mac mac = new Mac("MacBook Pro", 3, 16, "Apple M2 Pro", "Lithium-Polymer", "Secure Enclave");
        mac.tampilMac();

        System.out.println();

        Windows windows = new Windows("Dell XPS 15", 3, 32, "Intel Core i7", "Lithium-Ion", "Windows Hello");
        windows.tampilWindows();

        System.out.println();

        Pc pc = new Pc("ASUS ROG", 4, 16, "AMD Ryzen 9", 27);
        System.out.println("========== SPESIFIKASI PC ==========");
        pc.tampilPc();
    }
}