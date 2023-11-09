public class PersegiPanjangDemo {
    /* Main Method */
    public static void main(String[] args){
        System.out.println("Sebelum membuat objek");
        //memanggil variabel static
        System.out.println("Jumlah objek = "+ PersegiPanjang.jumlahObjek);

        //Membuat objek persegiPanjang1
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        System.out.println("\nSetelah membuat objek persegiPanjang1");
 
        //memanggil variabel instance
        System.out.println("Panjang = "+persegiPanjang1.panjang+ "\nLebar = "+persegiPanjang1.lebar);

         //memanggil method static
        System.out.println("Jumlah objek = "+ PersegiPanjang.getJumlahObjek());

        //Membuat objek persegiPanjang2
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(8, 5);
        System.out.println("\nSetelah membuat objek persegiPanjang2");
        //memanggil variabel instance
        System.out.println("Panjang = "+ persegiPanjang2.panjang +"\nLebar= "+persegiPanjang2.lebar);

        //memanggil variabel static
        System.out.println("Jumlah objek = "+ PersegiPanjang.jumlahObjek);
    }
 }