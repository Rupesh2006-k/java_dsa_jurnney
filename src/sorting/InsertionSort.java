package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        // Unsorted array
        int arr[] = {5, 9, 4, 1, 3, 8};

        // Call insertion sort
        insertionSort(arr);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {

        // Get the length of the array
        int n = arr.length;

        // Start from the second element because
        // the first element is already considered sorted
        for (int i = 1; i < n; i++) {

            // Store the current element
            int key = arr[i];

            // Index of the previous element
            int prev = i - 1;

            // Shift all elements greater than key
            // one position to the right
            while (prev >= 0 && arr[prev] > key) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insert the key at its correct position
            arr[prev + 1] = key;
        }
    }
}