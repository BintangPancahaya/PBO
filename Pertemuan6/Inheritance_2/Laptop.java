package Inheritance_2;

public class Laptop extends Komputer {
    public String jnsBatrei;

    public Laptop() {
    }

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
    }

    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai       : " + jnsBatrei);
    }
}