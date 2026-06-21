package arrays;

public class SecondGreatestElm {

    public static void main(String[] args) {
        int arr[] = {1, 8, 9, 6, 10, 10, 5, 2};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }
//            else if ((arr[i] > secMax) && (arr[i] != max)) {
            else if (arr[i] > secMax) {
                secMax = arr[i];
            }
        }


        System.out.println(max);
        System.out.println(secMax);
    }
}
