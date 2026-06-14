package loopsQuestion;

public class ReverseN {

    public static void main(String[] args) {
        int n = 123;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10; // last digit ko nikalo e.g., 1235 => 123.5
            rev = (rev * 10) + lastDigit; // revers of a number  
            n /= 10;  // last digi t ko hatao form n
        }

        System.out.println("\nrevers number : " + rev);
    }
}
