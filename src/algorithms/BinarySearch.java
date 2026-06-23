package algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        int ans = -1;
        int target = 70;
        int n = arr.length;

        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(ans);

    }
}
