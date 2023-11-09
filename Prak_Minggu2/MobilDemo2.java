public class MobilDemo2{
    public static void main (String args[]){
    //Membuat objek
    Mobil2 mobilku = new Mobil2();

    mobilku.hidupkanMobil = "nyala";
    mobilku.matikanMobil = "mati";

    System.out.println("Mobilku dalam kondisi = "+mobilku.hidupkanMobil);
    System.out.println("Mobilku dalam kondisi = "+mobilku.matikanMobil);

    mobilku.tambahGigi();
    mobilku.tambahGigi();
    mobilku.kurangGigi();

    System.out.println();
    
    }
}