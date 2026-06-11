package conditionalQ;

import java.util.Scanner;

//shopping discount
public class Q5 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount : ");
        int amt = sc.nextInt();
        int discount = 0;

        if (amt > 0 && amt <= 5000) {
            discount = 0;
            System.out.println(" 0% Discount");
        } else if (amt >= 5001 && amt <= 7000) {
            discount = 5;
            System.out.println(" 5% Discount");
        } else if (amt >= 7001 && amt <= 9000) {
            discount = 10;
            System.out.println(" 10% Discount");
        } else {
            discount = 20;
            System.out.println(" 20 % Discount");
        }
    }
}
