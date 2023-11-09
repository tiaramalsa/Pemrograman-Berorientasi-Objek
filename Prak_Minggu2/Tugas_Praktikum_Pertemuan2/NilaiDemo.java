public class NilaiDemo{
    public static void main(String args[]){
        Nilai mhs1 = new Nilai();

        mhs1.nim = "A11.2021.13352";
        mhs1.nama = "Tiara Malsa Ardila";
        mhs1.uts = 89.0f;
        mhs1.tugas = 85.4f;
        mhs1.uas = 90.0f;

        mhs1.hitungNilai();
        mhs1.cetakNilai();

        System.out.println();
    }
}