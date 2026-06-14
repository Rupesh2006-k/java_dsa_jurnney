package loopsQuestion;

public class Palindrom {
    public static void main(String[] args) {
        int n = 121;
        int copy = n;
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }

        if (copy == rev) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}