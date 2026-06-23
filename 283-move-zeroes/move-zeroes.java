class Solution {
    public void moveZeroes(int[] arr) {
               
        int n = arr.length;
        int ans[] = new int[n];
        int start = 0, end = n - 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                ans[start++] = arr[i];
            } else {
                ans[end--] = arr[i];
            }
        }
// copy values
        for(int i = 0 ; i < n ; i++){
            arr[i] = ans[i];
        }
 
    }
}