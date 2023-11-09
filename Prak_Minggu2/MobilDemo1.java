public class MobilDemo1{
    public static void main (String args[]){
    //Membuat objek
    Mobil1 mobilku = new Mobil1();
    Mobil1 mobilmu = new Mobil1();

    //Memanggil Atribut dan memberi nilai
    mobilku.warna = "Hitam";
    mobilku.tahunProduksi = 2003;
    
    System.out.println("Mobilku warna = "+mobilku.warna);
    System.out.println("Mobilku tahun = "+mobilku.tahunProduksi);

    mobilku.tambahGigi();
    mobilku.tambahGigi();
    mobilku.kurangGigi();

    mobilmu.warna = "Putih";
    mobilmu.tahunProduksi = 2021;
    System.out.println();
    System.out.println("Mobilmu warna = "+mobilmu.warna);
    System.out.println("Mobilmu tahun = "+mobilmu.tahunProduksi);
    }
}