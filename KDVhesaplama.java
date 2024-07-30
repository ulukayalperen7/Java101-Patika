import java.util.Scanner;

public class KDVhesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen para değerini giriniz: ");
        double para = scanner.nextDouble();

        if (0 < para && para <= 1000) {
            double kdvTutari1 = (para * 18) / 100;
            double kdvliFiyat1 = para + kdvTutari1;
            System.out.println("KDVsiz fiyat: " + para);
            System.out.println("KDVli fiyat: " + kdvliFiyat1);
            System.out.println("KDV tutarı " + kdvTutari1);
        } else if (para > 1000) {
            double kdvTutari2 = (para * 8) / 100;
            double kdvliFiyat2 = para + kdvTutari2;
            System.out.println("KDVsiz fiyat: " + para);
            System.out.println("KDVli fiyat: " + kdvliFiyat2);
            System.out.println("KDV tutarı " + kdvTutari2);
        }
    }
}