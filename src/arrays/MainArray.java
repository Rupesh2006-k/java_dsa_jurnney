package arrays;

import java.util.Scanner;

public class MainArray {

    public static void main(String[] args) {
// dataType variableName[] = new dataType[size];
//
// Array declaration types
//        int arr[] = new int[]{1, 2, 3, 4, 5};
//        int[] arr1 = new int[5];
//        int[] arr2 = new int[5];
//        int[] arr3 = new int[5];
//
// Array value initialization
//        int arr4[] = new int[]{1, 2, 3, 4, 5};
//        int arr5[] = {1, 2, 3, 4, 5};
//
// Loop to print array elements
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];


        System.out.println("Enter " + size + " elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered elements are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
