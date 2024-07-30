
import java.util.Scanner;

public class recursivePrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sayi: ");
        int n = scanner.nextInt();
        if (isPrime(n, 2)) {
            System.out.println(n + " bir asal sayidir.");
        } else {
            System.out.println(n + " bir asal sayi değildir.");
        }

    }

    static boolean isPrime(int n, int dividing) {

        if (n <= 2) {
            return (n == 2); // if is 2, then true otherwise false
        }
        if (n % dividing == 0) {
            return false;
        }

        if (dividing * dividing > n) {
            return true;
        }
        return isPrime(n, dividing + 1);
    }
    /* 
    static boolean isPrime(int n) {

        if (n == 2) {
            return true;
        } else if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    } */

}
