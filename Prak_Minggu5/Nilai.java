import java.util.Scanner;
public class Nilai {
        String nim, nama, predikat;
        Float uts, tugas, uas, puts, ptugas, puas, na;
        char nHuruf;
        
       
        void inputData(){
            Scanner sc = new Scanner(System.in);
            System.out.println("========================================");
            System.out.println("         INPUT NILAI MAHASISWA          ");
            System.out.println("========================================");
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Tugas : ");
            Float tugas = sc.nextFloat();
            ptugas = 0.3f*tugas;
            System.out.println("Point Tugas : "+ptugas);
            System.out.print("UTS : ");
            Float uts = sc.nextFloat();
            puts = 0.35f*uts;
            System.out.println("Point UTS : "+puts);
            System.out.print("UAS : ");
            Float uas = sc.nextFloat();
            puas = 0.35f*uas;
            System.out.println("Point UAS : "+puas);
            na = puts+ptugas+puas; 
            System.out.print("Nilai Akhir : "+na);

        }
        void cetakNilai(){
            System.out.println("Nilai Huruf : "+getNilaiHuruf(na));
            System.out.println("Predikat    : "+getPredikat(nHuruf));
        }
        char getNilaiHuruf(float na){
            if(na>=85)
            nHuruf='A';
            else if(na>=70 && na<85)
            nHuruf='B';
            else if(na>=60 && na<70)
            nHuruf='C';
            else if(na>=40 && na<60)
            nHuruf='D';
            else
            nHuruf='E';
            return nHuruf;
        } 
        String getPredikat(char nhuruf){
            switch(nhuruf){
            case 'A':predikat="Apik";
            break;
            case 'B':predikat="Baik";
            break;
            case 'C':predikat="Cukup";
            break;
            case 'D':predikat="Dablek";
            break;
            default:predikat="Elek";
        }
            return predikat;
        } 

        static void cetakDaftarNilai(Nilai[] daftarNilai, int jumlahData){
            System.out.println("=============================================");
            System.out.println("Daftar Nilai Mahasiswa: ");
            System.out.println("=============================================");
            System.out.println("No\tNIM\tNama\tNilai Akhir\tNilai Huruf\tPredikat");

            for (int i=0; i<jumlahData; i++){
                Nilai nilai = daftarNilai[i];
                System.out.printf("%d\t%s\t%s\t%.2f\t\t%c\t\t%n\n", i+1,nilai.nim,nilai.nama,nilai.na,nilai.getNilaiHuruf(nilai.na),nilai.getPredikat(nilai.nHuruf));
            }


        }


}
