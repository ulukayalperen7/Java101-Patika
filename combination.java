
import java.util.Scanner;

public class combination {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.print("Kümenin eleman sayısını giriniz (n): ");
        int n = scanner.nextInt();
        
        System.out.print("Seçilecek eleman sayısını giriniz (r): ");
        int r = scanner.nextInt();

        if (n >= r) {
            int combination = calculateCombination(n, r);
            System.out.println("Kombinasyon (C(" + n + "," + r + ")) = " + combination);
        } else {
            System.out.println("Hata: 'n' değeri 'r' değerinden büyük veya eşit olmalıdır.");
        }

        scanner.close();
    }

    public static int factorial(int k) {
        if (k >= 1)
            return k * factorial(k - 1);
        else
            return 1;
    }

    public static int calculateCombination(int n, int r) {
        int nFac = factorial(n);
        int rFac = factorial(r);
        int nMinusrFac = factorial(n - r);
        return nFac / (rFac * nMinusrFac);
    }
}
