import java.util.Arrays;

public class Varags {
    public static void main(String[] args) {
        check("test", 1, 2, 3, 4);
    }

    public static void check(String name, int... arr) {
        System.out.println("Name : " + name);
        System.out.println(Arrays.toString(arr));
    }
}
