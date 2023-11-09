public class KaryawanTetap extends Karyawan{
    private int gajiPokok;

    public KaryawanTetap(String nama, int tunjanganAnak, int gajiPokok){
        super(nama, tunjanganAnak);
        this.gajiPokok = gajiPokok;
    }
    public int getGajiPokok(){
        return gajiPokok;
    }
    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    public int hitungTotalGaji(){
        return gajiPokok + getTunjanganAnak();
    }
}