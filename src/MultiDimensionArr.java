import java.util.Scanner;

public class MultiDimensionArr {
    public static void main(String[] args) {

//        int arr[][] = new int[3][3];
//        int arr[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of array : ");
        int rows = sc.nextInt();
        System.out.println("Enter the cols of array : ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.println("Enter value at matrix [" + i + "] [" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
