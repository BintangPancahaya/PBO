package Pertemuan_1.TugasDemo;

public class Microphone {
    private String merk;
    private boolean wireless;

    Microphone(String merk, boolean wireless){
        this.merk = merk;
        this.wireless = wireless;
    }

    public String getMerk(){
        return merk;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public boolean getWireless(){
        return wireless;
    }

    public void setWireless(boolean wireless){
        this.wireless = wireless;
    }

    void nyalakan(){
        System.out.println("Microphone "+merk+" dinyalakan");
    }

    void aturVolume(int volume){
        System.out.println("Volume microphone diatur ke "+volume+"%");
    }

    void cetakInfo(){
        System.out.println("[Microphone] Merk: "+merk+", Wireless: "+(wireless?"Iya":"Tidak"));
    }
}
