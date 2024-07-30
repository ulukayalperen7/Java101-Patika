
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("sayıyı giriniz: ");
        int bound = scanner.nextInt();

        for (int i = 2; i < bound; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static boolean isPrime(int n) { /*  check the number prime or not  */
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
