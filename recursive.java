
import java.util.Scanner;

public class recursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("tabanı giriniz: ");
        int base = scanner.nextInt();
        System.out.print("üssü giriniz: ");
        int expo = scanner.nextInt();
        System.out.println(expo(base, expo));

    }

    static int expo(int base, int expo) {
        if (expo == 0) {
            return 1;
        }
        return base * expo(base, expo - 1);
    }
}
