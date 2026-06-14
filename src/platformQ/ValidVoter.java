package platformQ;

import java.util.Scanner;

/*
Check if User is a Valid Voter

Description

Write a program that takes a user's age and name as input and
checks whether the user is a valid voter. • A user is considered a
valid voter if their age is 18 or older. • Ifthe user is 18 or older,
return : <Name> is a valid voter • Ifthe user is younger than 18,
return : < Name > is not a valid voter.

Examples :

Sample Input: 20 Alice
Expected Output:
Alice is a valid voter.
*/
public class ValidVoter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        if (age >= 18) System.out.println(name + " is a valid voter.");
        else System.out.println(name + " is not a valid voter.");

    }
}
