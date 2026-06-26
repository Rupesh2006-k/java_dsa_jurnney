package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // Unsorted array
        int arr[] = {5, 4, 3, 2, 1};
        // Call selection sort method
        selection(arr);
        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr) {
        // Get array length
        int n = arr.length;
        // Loop through each element of the array
        for (int i = 0; i < n - 1; i++) {
            // Assume current index has the minimum value
            int min = i;
            // Find the index of the smallest element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap if a smaller element is found
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
