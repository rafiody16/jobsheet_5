import java.util.Scanner;

public class PemilihanPercobaan322 {
    public static void main(String [] args)
    {
        Scanner input22 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("Masukkan Angka Pertama  : ");
        angka1 = input22.nextDouble();
        System.out.println("Masukkan Angka Kedua    :");
        angka2 = input22.nextDouble();
        System.out.println("Masukan Operator        :");
        operator = input22.next().charAt(0);

        switch (operator)
        {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 +" = "+ hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 +" = "+ hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 +" = "+ hasil);
                break;
        }

    }
}
