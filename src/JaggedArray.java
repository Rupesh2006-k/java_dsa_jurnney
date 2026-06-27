import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {new int[4], new int[3], new int[2],};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the matrix element [ " + i + " ] [ " + j + " ] :  ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("\nJagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}