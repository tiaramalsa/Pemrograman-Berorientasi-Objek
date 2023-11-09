import java.util.Scanner;
public class NilaiDemo{
    public static void main(String args[]){
        Nilai mhs1 = new Nilai();
        String ulangi;
        Nilai[] daftarNilai = new Nilai[100];
        int jumlahData = 0;
        do{
            Scanner sc = new Scanner(System.in);
            Scanner ulang = new Scanner(System.in);
            Nilai nilai = new Nilai();
            mhs1.inputData();
            mhs1.cetakNilai();
            daftarNilai[jumlahData] = nilai;
            jumlahData++;
            System.out.print("Apakah masih ingin nilai[y/n]: ");
            ulangi = ulang.nextLine();
        }while(ulangi.equalsIgnoreCase("y"));

        Nilai.cetakDaftarNilai(daftarNilai, jumlahData);
    }
}