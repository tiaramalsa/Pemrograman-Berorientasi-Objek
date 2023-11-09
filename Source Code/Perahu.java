public class Perahu  extends Air{
    private int muatan;

    public int getMuatan(){
        return muatan;
    }
    public void setMuatan(int muatan){
        this.muatan =muatan;
    }
    public Perahu(){
        //this.muatan = 0;
    }
    public Perahu( String nama, int tahunProduksi, Boolean mesin, int muatan){
        super(nama, tahunProduksi, mesin);
        this.muatan = muatan;
    }
    public void reset(String nama, int tahunProduksi, Boolean mesin, int muatan){
        setNama(nama); 
        setTahunProduksi(tahunProduksi); 
        setMesin(mesin); 
        setMuatan(muatan);   
    }
    public String kategori(int muatan){
        if(muatan<=100)
            return "Kapal Kecil";
        else if(muatan<=200)
            return "Kapal Sedang";
        else
            return "Kapal Besar";
    }
    public void cetak(){
        super.cetak();
        System.out.println("Muatan \t\t= "+muatan+" orang");
        System.out.println("Kategori\t= "+kategori(muatan));
    }
}