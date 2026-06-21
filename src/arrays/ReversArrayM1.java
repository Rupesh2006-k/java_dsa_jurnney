package arrays;

import java.util.Arrays;

public class ReversArrayM1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] rev = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j++] = arr[i];  // correct
        }

        System.out.println(Arrays.toString(rev));
    }
}