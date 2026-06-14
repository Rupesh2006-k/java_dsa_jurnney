package conditionalQ;

import java.util.Scanner;

// shopping discount
public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount : ");
        int amt = sc.nextInt();

        double discount = 0;

        if (amt >= 0 && amt <= 5000) {
            discount = 0;
            System.out.println("0% Discount");
        } else if (amt <= 7000) {
            discount = 0.05;
            System.out.println("5% Discount");
        } else if (amt <= 9000) {
            discount = 0.10;
            System.out.println("10% Discount");
        } else if (amt > 9000) {
            discount = 0.20;
            System.out.println("20% Discount");
        } else {
            System.out.println("Invalid amount");
            return;
        }

        double disAmt = amt * discount;
        double bill = amt - disAmt;

        System.out.println("Discount Amount: " + disAmt);
        System.out.println("Final Bill: " + bill);

        sc.close();
    }
}