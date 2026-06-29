package arrays;

public class MatrixDiagonal {
    public static void main(String[] args) {

        // 3x3 matrix
        int mat[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Number of rows (or columns, kyunki square matrix hai)
        int n = mat.length;

        // Diagonal elements ka sum store karega
        int sum = 0;

        // Matrix ke har element par traverse karo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Agar element Primary Diagonal ya Secondary Diagonal par hai
                if (i == j || i + j == n - 1) {
                    sum += mat[i][j];
                }
            }
        }

        // Final diagonal sum print karo
        System.out.println(sum);
    }
}