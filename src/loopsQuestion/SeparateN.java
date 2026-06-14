package loopsQuestion;

public class SeparateN {

    public static void main(String[] args) {
        int n = 1235;
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10; // last digit ko nikalo e.g., 1235 => 123.5
            System.out.print(lastDigit + " ");
            sum += lastDigit;
            n /= 10;  // last digit ko hatao form n
        }

        System.out.println("\nsum : " + sum);

    }
}
