package project03;
public class KarpetAksi {
    public static void main(String[] args) {
        Karpet k = new Karpet();
        k.setMerk("Orchid");
        k.setWarna("Hijau");
        k.setHarga(13000);
        
        k.cetakinfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(k.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(k.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(k.getHarga());
    }
    
}
