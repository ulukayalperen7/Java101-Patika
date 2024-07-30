
import java.util.*;

public class basamakToplamlari {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen sayiyi giriniz : ");
        int number = scanner.nextInt();

        int sum = 0;
        int counter = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
            counter++;
        }
        System.out.println("basamaktaki sayıların toplamı: " + sum);
        System.out.println("kaç basamak ? " + counter);
    }
}
