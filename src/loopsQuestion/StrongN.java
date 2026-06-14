package loopsQuestion;

public class StrongN {

    public static void main(String[] args) {
        int n = 1455;
        int copy = n;
        int sum = 0;
        while (n > 0) {

            int lastDigit = n % 10;
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + lastDigit + " = " + fact);
            sum += fact;
            n /= 10;
        }

        System.out.println((sum == copy) ? "It is a strong number " + sum : "It is not a strong number " + copy);
    }

}
