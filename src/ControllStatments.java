/*
TOPIC : control flow statments / conditional statments
 */
public class ControllStatments {
    public static void main(String[] args) {

        int a = 100, b = 900, c = 80;


        if (a > b) {
            if (a > c) {
                System.out.println("max : " + a);
            }
        } else if (b > a) {
            if (b > c) {
                System.out.println("max : " + b);
            }
        } else {
            System.out.println("max : " + c);
        }

// 4:00
    }
}
