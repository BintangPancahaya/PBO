package Pertemuan_3.TugasMain;

public class EncapDemo {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if(newAge < 18 || newAge > 30){ 
            System.out.println("Batas umur Minimal 18 dan Maksimal 30!");
            age = 30;
        } else if(newAge > 17){
            age = newAge;
        } else {
            System.out.println("Umur Invalid!");
        }   
    }
}


 // if(newAge > 30){
        //     age = 30;
        // } else {
        //     age = newAge;
        // }