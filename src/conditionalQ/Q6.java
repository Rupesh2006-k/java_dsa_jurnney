import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Vowel Check
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        //
        //        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //            System.out.println("Vowel");
        //        } else {
        //            System.out.println("Consonant");
        //        }


        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Voval");
            default -> System.out.println("Consonant");
        }


//        // Day Name
//        System.out.print("Enter day number (1-7): ");
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Invalid number");
//        }
    }
}