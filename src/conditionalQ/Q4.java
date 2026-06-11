package conditionalQ;
// check given year is a leap year or not

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("It is a leap year: " + year);
        } else {
            System.out.println("It is not a leap year: " + year);
        }

        sc.close(); // good practice
    }
}