public class Kendaraan{
    private String nama;
    private int tahunProduksi;

    public String getNama(){
        return nama;
    }
    // private String nama() {
    //     return null;
    // }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getTahunProduksi() {
        return tahunProduksi;
    }
    public void setTahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }
    public Kendaraan(){
        // this.nama = "Anonymous";
        // this.tahunProduksi = 0;
    }
    public Kendaraan(String nama, int tahunProduksi){
        this.nama = nama;
        this.tahunProduksi = tahunProduksi; 
    }
    public void cetak(){
        System.out.println("Nama\t = " +nama);
        System.out.println("Tahun Produksi = " +tahunProduksi);
    }
}
