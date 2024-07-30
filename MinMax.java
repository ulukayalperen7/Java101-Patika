
import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sayı : ");
        int n = scanner.nextInt();

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0, 50, 32, 7, 45, 66, 18, 55, -59, 24, -632};

        Arrays.sort(arr);

        int maxnear = arr[0];
        int minnear = 0;

        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            if (maxnear < n) {
                maxnear = arr[i];
                minnear = arr[i - 1];
            }
        }
        System.out.println("sayıdan küçük en  yakın sayı: " +minnear);
        System.out.println("sayıdan büyük en  yakın sayı: " +maxnear);
       

    }
}
