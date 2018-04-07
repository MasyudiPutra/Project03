package project03;

public class Karpet {
    private String merk;
    private String warna;
    private double harga;
    
    void cetakinfo(){
        System.out.println("Merk Karpet \t: "+merk+"\n"+
                 "Warna Karpet \t "+warna+"\n"+
                 "Harga Karpet \t "+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
     
}
