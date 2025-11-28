package Pertemuan_2;

public class TugasNo5 {
    public static void main(String[] args) {
        int[] angka = {1,2,3};
        System.out.println("Awal Program");
        try{
            System.out.println(angka[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Akhir Program");
    }
}
