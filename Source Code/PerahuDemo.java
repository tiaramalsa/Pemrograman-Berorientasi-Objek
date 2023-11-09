public class PerahuDemo {
    public static int min2(int a, int b){
        if(a<b)
            return a;
        else
            return b;
        }
        public static boolean isNamaSama(Perahu p1, Perahu p2){
       if(p1.getNama().toLowerCase().equals(p2.getNama().toLowerCase()))
            return true;
                else
            return false;
            }
        public static void main(String[] args){
        Perahu[] p = new Perahu[3];
        p[0] = new Perahu();
        p[1] = new Perahu("Kapal Feri", 1990, true, 250);
        p[2] = new Perahu("Perahu Karet", 2016, true, 10);
        p[0].reset("Perahu Tradisional", 1988, false, 100);
       
        System.out.println("========== CETAK KENDARAAN ========== ");
        System.out.println("Kendaraan 1");
        p[0].cetak();
        System.out.println("Kendaraan 2");
        p[1].cetak();
        System.out.println("Kendaraan 3");
        p[2].cetak();
       
        System.out.print("Nama perahu pertama dan kedua ");
        if(isNamaSama(p[0], p[1]))
        System.out.println("sama");
        else
        System.out.println("tidak sama");
       
        System.out.print("");
        if(p[0].getMuatan()<min2(p[1].getMuatan(), p[2].getMuatan()))
        System.out.println("Muatan paling sedikit ="+p[0].getNama());
        else if(p[1].getMuatan()<min2(p[0].getMuatan(),
        p[2].getMuatan()))
        System.out.println("Muatan paling sedikit"+p[1].getNama());
        else
        System.out.println("Muatan paling sedikit = "+p[2].getNama());
        }
}