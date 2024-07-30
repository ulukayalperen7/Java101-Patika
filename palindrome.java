
public class palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(15351));
        System.out.println(isPalindrome(144));
    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int reverseNumber = 0;
        int lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }
        return reverseNumber == number;
    }

}
