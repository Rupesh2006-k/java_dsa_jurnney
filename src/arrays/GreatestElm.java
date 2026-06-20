package arrays;

public class GreatestElm {
    public static void main(String[] args) {
//        int max = Integer.MAX_VALUE;
//        int min = Integer.MIN_VALUE;

        int arr[] = {1, 6, 2, 3, 4, 5, 8, 9};

        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("Max element : " + max + " At index : " + maxIndex);
    }
}
