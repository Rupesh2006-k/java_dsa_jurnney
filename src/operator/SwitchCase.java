package operator;

import java.util.Scanner;

// switch case
public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();
//METHOD - 1

//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tusday");
//                break;
//            case 3:
//                System.out.println("Wednessday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 55:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid number");
//        }


//        METHOD - 2

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tusday");
            case 3 -> System.out.println("Wednessday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid number");
        }
    }
}