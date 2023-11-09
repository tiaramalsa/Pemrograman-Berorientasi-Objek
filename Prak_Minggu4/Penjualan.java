import java.util.Scanner;
    public class Penjualan {
    String nama;
    float harga,total_harga;
    int kode,jumlah;

    public Scanner str=new Scanner(System.in);
    public Scanner in=new Scanner(System.in);

  public void setData(){
    System.out.println("========================================");
    System.out.println("         INPUT DATA PENJUALAN           ");
    System.out.println("========================================");
    System.out.print("Kode Barang : "); kode = in.nextInt();
    System.out.print("Nama Barang : "); nama = str.nextLine();
    System.out.print("Jumlah Barang : "); jumlah = in.nextInt();
    System.out.print("Harga Barang : "); harga = in.nextFloat();
  }

  public void getTotalPembelian(){
    total_harga = harga*jumlah;
  }

  public void getBonus(){
    if(total_harga >= 500000 && jumlah > 5 ){
        System.out.println("Total Bayar : "+total_harga);
        System.out.println("Bonus : Setrika");

    }else if(total_harga >= 100000 && jumlah > 3 ){
        System.out.println("Total Bayar : "+total_harga);
        System.out.println("Bonus : Payung");

    }else if(total_harga >= 50000 && jumlah > 2 ){
        System.out.println("Total Bayar : "+total_harga);
        System.out.println("Bonus : Ballpoint");

    }
  }

  public void cetakNota(){
    System.out.println("========================================");
    System.out.println("             NOTA PENJUALAN             ");
    System.out.println("========================================");
    System.out.println("Kode Barang : "+kode);
    System.out.println("Nama Barang : "+nama);
    System.out.println("Jumlah Barang : "+jumlah); 
    System.out.println("Harga Barang : "+harga);
  }
}
