package Pertemuan_2;

public class Lingkaran {
    double phi,r;

    Lingkaran(double phi, double r){
        this.phi = phi;
        this.r = r;
    }

    double hitungLuas(){
        return phi*(r*r);
    }

    double hitungKeliling(){
        return 2*phi*r;
    }

    void tampilData(){
       System.out.println("Luas Lingkaran: "+hitungLuas()); 
       System.out.println("Keliling Lingkaran: "+hitungKeliling());
    }
}
