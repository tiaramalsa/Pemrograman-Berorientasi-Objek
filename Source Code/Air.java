public class Air extends Kendaraan{
    private Boolean mesin;

    public Boolean getMesin(){
        return mesin;
    }
    public void setMesin(Boolean mesin){
        this.mesin = mesin;
    }
    public Air(){
        //this.mesin = true;
    }
    public Air(String nama, int tahunProduksi, Boolean mesin){
        super(nama, tahunProduksi);
        this.mesin = mesin;
    }
    public void cetak(){
        super.cetak();
        System.out.println("Mesin = ");
        if(mesin==true) System.out.println("Dayung");
        else System.out.println("Mesin");
    }
}