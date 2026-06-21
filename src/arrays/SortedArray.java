package arrays;

public class SortedArray {
    public static void main(String[] args) {
        int arr[] = {3, 9, 5, 8, 7};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is NOT sorted");
        }

    }
}
// 1:55:52