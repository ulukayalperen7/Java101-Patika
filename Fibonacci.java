
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("fibonacci için eleman sayısını giriniz: ");
        int n = scanner.nextInt();

        int f0 = 0;
        int f1 = 1;
        int f2 = 1;

        System.out.println(f0 + " ");
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(f1 + " ");
            } else if (i == 1) {
                System.out.println(f2 + " ");
            } else {
                int sequnce = f1 + f2;
                System.out.println(sequnce + " ");
                f1 = f2;
                f2 = sequnce;
            }

        }

    }

}
