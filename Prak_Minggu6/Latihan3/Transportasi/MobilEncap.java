package Transportasi;

public class MobilEncap {
    private String merk;
    private int tahunProduksi;

    public MobilEncap(String merk, int tahunProduksi){
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    public String getMerk(){
        return merk;
    }

    public int getTahunProduksi(){
        return tahunProduksi;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setTahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }

    public void jalan(){
        System.out.println("Mobil " + merk + " Tahun " + tahunProduksi + " Sedang jalan");
    }
}
