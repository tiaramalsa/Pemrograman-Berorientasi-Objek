import java.util.Scanner;
public class PenjualanDemo {
    public static void main(String[] args){
        String ulangi;
        Penjualan belanja = new Penjualan();

        do{
            Scanner str = new Scanner(System.in);
            Scanner ulang = new Scanner(System.in);
            belanja.setData();
            belanja.cetakNota();
            belanja.getTotalPembelian();
            belanja.getBonus();
            System.out.println();
            System.out.println("Apakah ingin belanja lagi? (y/n)");
            ulangi = ulang.nextLine();
        } while(ulangi.equalsIgnoreCase("y"));
    }
}