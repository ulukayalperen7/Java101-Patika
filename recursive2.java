
import java.util.Scanner;

public class recursive2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();
        System.out.print("Çıktısı: ");
        rcs(n);

    }

    static void rcs(int n) {
        System.out.print(n + " ");
        if (n > 0) {
            rcs(n - 5);
            System.out.print(n + " ");
        }
        
    }

}
