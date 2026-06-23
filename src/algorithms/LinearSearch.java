package algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {12, 30, 50, 80, 1, 90, 400};
        int n = arr.length;
        int target = 400;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
