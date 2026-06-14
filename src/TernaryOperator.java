public class TernaryOperator {

    public static void main(String[] args) {
        int n = 12;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        String ans = n >= 1 ? "Prime number" : "Not a prime number";
        System.out.println(ans);
    }
}
