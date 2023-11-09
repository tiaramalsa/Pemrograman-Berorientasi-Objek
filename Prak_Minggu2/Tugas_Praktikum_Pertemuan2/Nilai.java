public class Nilai {
        String nim, nama;
        Float uts, tugas, uas, puts, ptugas, puas, na;
       
        void hitungNilai(){
            puts = 0.35f*uts;
            ptugas = 0.3f*tugas;
            puas = 0.35f*uas;
            na = puts+ptugas+puas; 
        }
        void cetakNilai(){
            System.out.println("NIM         : "+nim);
            System.out.println("Nama        : "+nama);
            System.out.println("UTS         : "+uts+" 35%: "+puts);
            System.out.println("Tugas       : "+tugas+" 30%: "+ptugas);
            System.out.println("UAS         : "+uas+" 35%: "+puas);
            System.out.println("Nilai Akhir : "+na);
        }
}
