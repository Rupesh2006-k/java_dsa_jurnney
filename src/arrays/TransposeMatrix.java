package arrays;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = matrix.length, column = matrix[0].length;
        int ans[][] = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                ans[j][i] = matrix[i][j];
            }
        }


        System.out.println("Original matrix");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Transpose matrix ");
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

}
