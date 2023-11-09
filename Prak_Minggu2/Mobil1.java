public class Mobil1{
    String warna;
    int tahunProduksi;
    int gigi = 0;

    void tambahGigi(){
        gigi = gigi + 1;
        System.out.println("Gigi sekarang = "+gigi);
    }
    void kurangGigi(){
        gigi = gigi - 1;
        System.out.println("Gigi sekarang = "+gigi);
    }
}