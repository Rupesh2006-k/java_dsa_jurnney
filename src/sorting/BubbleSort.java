package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1, 8, 5, 6, 7, 3, 4, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwaped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
                    swap(arr, i, j);
                    isSwaped = true;
                }
            }
            System.out.println("Pass " + (i + 1) + ": " + isSwaped);
            if (!isSwaped) break;
        }
    }
}