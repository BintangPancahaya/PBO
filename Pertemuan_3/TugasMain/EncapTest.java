package Pertemuan_3.TugasMain;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(20);

        System.out.println("Name : "+encap.getName());
        System.out.println("Age : "+encap.getAge());
    }
    
}

//Soal no 2 : Karena di class EncapDemo dan pada pengkodisian if
//jika kondisi umur nya lebih dari 30 maka umur akan di set menjadi 30.