public class PersegiPanjang {
 //panjang dan lebar dari persegi panjang
    public int panjang;
    public int lebar;
    public static int jumlahObjek = 0; //variabel static
 
 //konstruktor dari objek PersegiPanjang
    public PersegiPanjang(){
    jumlahObjek++;
 }

 //konstruktor dari objek PersegiPanjang
    public PersegiPanjang(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
        jumlahObjek++;
 }

 //mengembalikan nilai getJumlahObjek
    public static int getJumlahObjek(){
         return jumlahObjek;
 }
 
 //mengembalikan nilai luas persegi panjang
    public int getLuas(){
        return panjang*lebar;
 }

 //mengembalikan nilai keliling persegi panjang
    public int getKeliling(){
        return 2*(panjang+lebar);
 }
}