package loopsQuestion;

public class SumOfN {
    public static void main(String[] args) {
        int n = 5, sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = i + sum;
        }
        System.out.println(" sum = " + sum);
    }
}
