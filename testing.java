import java.util.Scanner;

public class testing {
    public static void main(String[] args) {

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        double kg1 = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        double kg2 = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        double kg3 = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        double kg4 = scanner.nextDouble();
        System.out.print("Patlican Kaç Kilo ? :");
        double kg5 = scanner.nextDouble();

        double total = kg1 * armut + kg2 * elma + kg3 * domates + kg4 * muz + kg5 * patlican;
        System.out.println("toplam tutar: " + total);
    }
}