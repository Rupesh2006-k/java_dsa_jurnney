import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double d = (double) (a + b + c);
        System.out.println(d);
    }
}