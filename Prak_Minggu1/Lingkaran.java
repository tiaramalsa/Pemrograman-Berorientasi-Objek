public class Lingkaran {
    public static void main(String[] s){
        float phi = 3.14f;
        //default pecahan double jika dibuat float diberi suffix f
        int r = 10;
        float luas = phi*(r*r);
        float keliling = 2*phi*r;
        System.out.println("Phi : " +phi);
        System.out.println("Jari : " +r);
        System.out.println("Luas : " +luas);
        System.out.println("Keliling : " +keliling);
        }

}
