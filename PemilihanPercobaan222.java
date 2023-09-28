import java.util.Scanner;

public class PemilihanPercobaan222 {
    public static void main(String [] args)
    {
        Scanner input22 = new Scanner(System.in);

        System.out.println("Nilai UAS   :");
        float uas = input22.nextFloat();
        System.out.println("Nilai UTS   :");
        float uts = input22.nextFloat();
        System.out.println("Nilai Kuis  :");
        float kuis = input22.nextFloat();
        System.out.println("Nilai Tugas :");
        float tugas = input22.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai Akhir: "+ total +" sehingga "+ message);

        if (total > 80)
        {
            System.out.println("Predikat Nilai: A");
        } 
        else if (total > 73 && total <= 80 )
        {
            System.out.println("Predikat Nilai: B+");
        }
        else if (total > 65 && total <= 73)
        {
            System.out.println("Predikat Nilai: B");
        }
        else if (total > 60 && total <= 65)
        {
            System.out.println("Predikat Nilai: C+");
        }
        else if (total > 50 && total <= 60)
        {
            System.out.println("Predikat Nilai: C");
        }
        else if (total > 39 && total <= 50)
        {
            System.out.println("Predikat Nilai: D");
        }
        else
        {
            System.out.println("Predikat Nilai: E");
        }
    }
    
}
