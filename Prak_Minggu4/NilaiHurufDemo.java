import java.util.Scanner;

public class NilaiHurufDemo{
    public static void main(String[] args){
        String ulangi;
        NilaiHuruf mhs1 = new NilaiHuruf();

        do{
        Scanner sc = new Scanner(System.in);
        Scanner ulang = new Scanner(System.in);
        mhs1.nim = "A11.2021.13352";
        mhs1.nama = "Tiara Malsa Ardila";
        mhs1.uts = 89.3f;
        mhs1.tugas = 70.4f;
        mhs1.uas = 80.3f;

        mhs1.hitungNilai();
        mhs1.cetakNilai();
        
        System.out.println("Apakah Anda ingin hitung nilai[y/n]: ");
        ulangi = ulang.nextLine();
        }while (ulangi.equalsIgnoreCase("y"));
        
    }
}