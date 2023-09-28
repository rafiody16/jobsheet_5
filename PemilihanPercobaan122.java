
import java.util.Scanner;

public class PemilihanPercobaan122 {

    public static void main (String [] args)
    {
        Scanner input22 =  new Scanner(System.in);


        System.out.println("Masukkan Angka: ");
        int angka = input22.nextInt();

        String hasil = (angka %2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println("Angka "+ angka +" adalah "+ hasil);

        // if(angka %2 == 0)
        // {
        //     System.out.println("Angka "+ angka +" Bilangan Genap");
        // }
        // else
        // {
        //     System.out.println("Angka "+ angka +" Bilangan Ganjil");
        // }
    }
    
}