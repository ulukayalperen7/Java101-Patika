
import java.util.Scanner;

public class usAlma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("üssü alinacak sayiyi giriniz: ");
        int base = scanner.nextInt();

        System.out.print("üssü giriniz: ");
        int exponent = scanner.nextInt();

        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(result);
    }
}
