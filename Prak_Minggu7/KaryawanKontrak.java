public class KaryawanKontrak extends Karyawan{
    private int upahHarian; 
    private int totalHariMasuk;

    public KaryawanKontrak(String nama, int tunjanganAnak,int upahHarian, int totalHariMasuk){
        super(nama, tunjanganAnak);
        this.upahHarian = upahHarian;
        this.totalHariMasuk = totalHariMasuk;
    }
    private void validasiTotalHariMasuk(int totalHariMasuk) throws IllegalArgumentException{
        if (totalHariMasuk <= 0){
            throw new IllegalArgumentException("Total hari masuk harus lebih ari 0");
        }
    }
    public int getUpahHarian(){
        return upahHarian;
    }
    public void setUpahHarian(int upahHarian){
        this.upahHarian = upahHarian;
    }
    public int getTotalHariMasuk(){
        return totalHariMasuk;
    }
    public void setTotalHariMasuk(int totalHariMasuk){
        validasiTotalHariMasuk(totalHariMasuk);
        this.totalHariMasuk = totalHariMasuk;
    }
    public int hitungTotalUpah(){
        return(upahHarian * totalHariMasuk)+getTunjanganAnak();
    }
}