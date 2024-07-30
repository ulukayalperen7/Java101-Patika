
import java.util.Scanner;

public class Avarage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("listenin eleman sayısı: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". eleman: ");
            arr[i] = scanner.nextInt();
        }

        // harmonik seri 
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (arr[i]);
        }

        // harmonik ortalama : 
        System.out.println("harmonik ortalama: " + n / sum);
        scanner.close();
    }
}
