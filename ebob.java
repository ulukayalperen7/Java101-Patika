
import java.util.Scanner;

public class ebob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("birinci sayıyı giriniz: ");
        int number1 = scanner.nextInt();

        System.out.print("ikinci sayyı giriniz: ");
        int number2 = scanner.nextInt();

        /*   int defult = 0;
        if (number1 < number2) {
            for (int i = 1; i <= number1; i++) {
                if (number2 % i == 0 && number1 % i == 0) {
                    defult = i;
                }
            }
        } else {
            for (int i = 1; i <= number2; i++) {
                if (number2 % i == 0 && number1 % i == 0) {
                    defult = i;
                }
            }
        }

        System.out.println(defult);
         */
        if (number1 < number2) {
            for (int i = number1; i >= 1; i--) {
                if (number1 % i == 0 && number2 % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        } else {
            for (int i = number2; i >= 1; i--) {
                if (number1 % i == 0 && number2 % i == 0) {
                    System.out.println("ebob: " + i);
                    break;
                }
            }
        }

        System.out.println();

        System.out.print("n1 : ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();

        for (int i = 1; i <= n1 * n2; i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println("ekok: " + i);
                break;
            }
        }
    

    }
}
