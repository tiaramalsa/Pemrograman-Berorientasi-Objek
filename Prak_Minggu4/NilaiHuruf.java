public class NilaiHuruf {
        String nim, nama, predikat;
        Float uts, tugas, uas, puts, ptugas, puas, na;
        char nHuruf;
       
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
            System.out.println("N.A         : "+na);
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


}
