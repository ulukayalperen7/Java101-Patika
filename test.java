import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        double mat = scanner.nextDouble();

        System.out.print("Fizik notunu giriniz: ");
        double fiz = scanner.nextDouble();

        System.out.print("Kimya notunu giriniz: ");
        double kim = scanner.nextDouble();

        System.out.print("Türkçe notunu giriniz: ");
        double tur = scanner.nextDouble();

        System.out.print("Tarih notunu giriniz: ");
        double tar = scanner.nextDouble();

        System.out.print("Müzik notunu giriniz: ");
        double muz = scanner.nextDouble();

        double result = (mat + fiz + kim + tur + tar + muz) / 6;
        System.out.println(result);
        if (result > 60) {
            System.out.println("Sınıfı Geçti!");
        } else {
            System.out.println("Sınıfta Kaldı!");
        }
    }
}