import Transportasi.*;
public class TransportasiDemo {
    public static void main(String[] args) {
        //membuat object
        Bicycle bike = new Bicycle();
        
        //memanggil atribut dan memberi nilai
        bike.speed=10;
        bike.gear=2;

        //memanggil method dan menunjuk nilai parameter
        bike.speedUp(10);
        bike.changeGear(2);

        Mobil avanza = new Mobil();
        Mobil.maju();
        Mobil.mundur();
        Mobil.belok();
        System.out.println("Roda : " + avanza.roda);
        System.out.println("Mesin : " + Mobil.mesin);

        //instance objek mobilencap
        MobilEncap mobilBaru = new MobilEncap("Toyota", 2021 );
        mobilBaru.jalan();

        //memanipulasi atribut menggunakan method setMerk() dan setTahunProduksi()
        mobilBaru.setMerk("Honda");
        mobilBaru.setTahunProduksi(2022);

        //memanipulasi atribut menggunakan method getMerk() dan getTahunProduksi()
        System.out.println("Merk Mobil : " + mobilBaru.getMerk());
        System.out.println("Tahun Produksi Mobil : " + mobilBaru.getTahunProduksi());
    }   
}
