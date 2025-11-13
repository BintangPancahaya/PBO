package Pertemuan_1.TugasDemo;

public class Mouse {
    private String merk;
    private int dpi;

    Mouse(String merk, int dpi){
        this.merk = merk;
        this.dpi = dpi;
    }

    public String getMerk(){
        return merk;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public int getDpi(){
        return dpi;
    }

    public void setDpi(int dpi){
        this.dpi = dpi;
    }

    void klikKiri(){
        System.out.println("Mouse "+merk+" melakukan klik kiri");
    }

    void aturDpi(int dpiNew){
        this.dpi = dpiNew;
        System.out.println("Dpi mouse "+merk+" diubah menjadi "+dpiNew);
    }

    void cetakInfo(){
        System.out.println("[Mouse] Merk: "+merk+", DPI: "+dpi);
    }
}
