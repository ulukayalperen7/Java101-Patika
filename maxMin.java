
import java.util.Scanner;

public class maxMin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("kaç sayı gireceksiniz: ");
        int lenght = scanner.nextInt();

        int number;

        int[] arrayOfNumbers = new int[lenght];

        for (int i = 1; i <= lenght; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            number = scanner.nextInt();
            arrayOfNumbers[i - 1] = number;
        }
        int container = 0;
        int inndex = 0;
        for (int i = 0; i < lenght - 1; i++) {
            container = arrayOfNumbers[i];
            inndex = i;

            for (int j = i + 1; j < lenght; j++) {
                if (container > arrayOfNumbers[j]) {
                    container = arrayOfNumbers[j];
                    inndex = j;
                }
            }
            if (inndex != i) {
                arrayOfNumbers[inndex] = arrayOfNumbers[i];
                arrayOfNumbers[i] = container;
            }

        }
        System.out.println("max : " + arrayOfNumbers[lenght - 1]);
        System.out.println("min : " + arrayOfNumbers[0]);
    }
}
