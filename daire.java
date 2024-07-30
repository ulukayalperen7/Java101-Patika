import java.util.Scanner;

public class daire {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen daire yarıçapını giriniz: ");
        double r = scanner.nextDouble();
        System.out.print("açı değerini(alfa) giriniz: ");
        double açı = scanner.nextDouble();

        double cevre = (2 * Math.PI * r * açı) / 360;
        double alan = (Math.PI * r * r * açı) / 360;

        System.out.println("alan: " + String.format("%.2f", alan));
        System.out.println("çevre: " + String.format("%.2f", cevre));

    }
}