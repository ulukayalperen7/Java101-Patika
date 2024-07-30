import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. kenar: ");
        double k1 = scanner.nextDouble();

        System.out.print("2. kenar: ");
        double k2 = scanner.nextDouble();

        double islem = k1 * k1 + k2 * k2;

        double hipo = Math.sqrt(islem);
        System.out.println("hipotenüs: " + hipo);
    }
}