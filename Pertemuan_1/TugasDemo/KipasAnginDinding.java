package Pertemuan_1.TugasDemo;

public class KipasAnginDinding extends KipasAngin {
    private boolean remoteControl;

    KipasAnginDinding(String merk, int kecepatan, boolean remoteControl){
        super(merk, kecepatan);
        this.remoteControl = remoteControl;
    }

    public boolean getRemoteControl(){
        return remoteControl;
    }

    public void setRemoteControl(boolean remoteControl){
        this.remoteControl = remoteControl;
    }

    void pasangDinding(){
        System.out.println("Kipas "+getMerk()+" dipasang di dinding.");
    }
    
    void cetakInfo(){
        System.out.println("[Kipas Angin Dinding] Merk: "+getMerk()+", Kecepatan: "+getKecepatan()+", Ada Remote: "+(remoteControl?"Iya" : "Tidak"));
    }
}
