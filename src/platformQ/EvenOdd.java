package platformQ;
/*

Check if a Number is Even or Odd

Description

Write a program that takes an integer as input and checks
whether the number is even or odd. • If the number is even,
return "Even". • If the number is odd, return "Odd:

Examples:
Sample Input : 4
Expected Output :
Even



*/

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        } else System.out.println("Odd");
    }

}
