package HSayilar;
import java.util.Scanner;
public class kod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double total = 0;

        System.out.print("N sayısını giriniz : ");
        n = sc.nextInt();

        for (double i = 1; i <= n; i++){

           total += (1 / i);


        }

        System.out.println("Toplam : " + total);

    }
}
