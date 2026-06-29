package arrays;

import java.util.Arrays;

public class FlipingImage {
    public static void main(String[] args) {

        // Original 2D binary matrix
        int arr[][] = {
                {1, 0, 0},
                {1, 0, 1},
                {0, 0, 1},
        };

        // Number of rows (matrix is square)
        int n = arr.length;

        // Step 1: Flip each row horizontally
        for (int i = 0; i < n; i++) {
            // Swap first half elements with second half
            for (int j = 0; j < n / 2; j++) {

                // Swap elements
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }

        // Step 2: Invert the binary values
        // 1 -> 0 and 0 -> 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (arr[i][j] == 1)
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }

        // Step 3: Print the final matrix
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}