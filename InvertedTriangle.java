
import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("basamak sayısını giriniz : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
