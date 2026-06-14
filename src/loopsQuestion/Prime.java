package loopsQuestion;

public class Prime {
    public static void main(String[] args) {
        int n = 58, count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i != n) System.out.print(i + " , ");
                else System.out.print(i);
            }
        }
        System.out.println(" \nTotal prime number of " + n + " is " + count);
    }

}
