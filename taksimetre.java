import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen gidilen mesafeyi giriniz: ");
        double mesafe = scanner.nextDouble();

        double kmUcret = 2.2;
        double ücret = 10 + mesafe * kmUcret;

        if (ücret <= 20) {
            System.out.println("taksi ücreti: " + String.format("%.2f", 20.0) + " TL'dir.");
        } else {
            System.out.println("taksi ücreti: " + String.format("%.2f", ücret) + " TL'dir.");
        }
    }
}