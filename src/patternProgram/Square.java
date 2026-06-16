package patternProgram;

public class Square {
    public static void main(String[] args) {
        int n = 8;
// outer loop  - number of rows
        for (int i = 1; i <= n; i++) {
// inner loop  - number of colums
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
