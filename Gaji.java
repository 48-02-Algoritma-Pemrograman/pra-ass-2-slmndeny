 import java.util.Scanner;

public class Gaji{
    public static int masaKerja;
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        masaKerja = input.nextInt();
        int jamLembur = input.nextInt();

        /* Pekerjaan anda mulai dari sini */
        int gajiBulanan = gaji(masaKerja);
        int lemburBulanan = lembur(masaKerja);

        lemburBulanan*=jamLembur;
        gajiBulanan+=lemburBulanan;

        System.out.println(gajiBulanan);
        /* Pekerjaan anda berakhir sini */

        System.out.println(Gaji.class.getDeclaredMethods().length);
        System.out.println(Gaji.class.getDeclaredFields().length);
        
    }
    
}
