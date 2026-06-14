package loopsQuestion;

public class FactorOfN {

    public static void main(String[] args) {
        int n = 12;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i != n) System.out.print(i + " , ");
                else System.out.println(i);
            }
        }
    }

}
