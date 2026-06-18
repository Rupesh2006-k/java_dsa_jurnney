package methodQuestion;

public class StrongN {

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 145;
        int copy = n;
        int sum = 0;
        while (n > 0) {

            int lastDigit = n % 10;
            sum += fact(lastDigit);
            n /= 10;
        }

        System.out.println((sum == copy) ? "It is a strong number " + sum : "It is not a strong number " + copy);
    }

}

