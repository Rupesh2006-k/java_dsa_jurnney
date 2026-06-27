import java.util.Arrays;

public class PassByReference {

    public static void main(String[] args) {

        // Original array
        int[] arr = {1, 2, 3};

        System.out.println("Before calling:");
        System.out.println(Arrays.toString(arr));

        // Pass array
        change(arr);

        System.out.println("After calling:");
        System.out.println(Arrays.toString(arr));
    }

    public static void change(int[] arr) {

        // Update original array
        // arr[1] = 200;

        // Create new array
        arr = new int[3];

        // Update new array
        arr[2] = 800;

        System.out.println("Inside method:");
        System.out.println(Arrays.toString(arr));
    }
}