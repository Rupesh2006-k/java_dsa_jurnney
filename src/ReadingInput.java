import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//       task one for the integer values

//        System.out.println("Enter first number : ");
//        int a = sc.nextInt();
//        System.out.println("Enter second number : ");
//        int b = sc.nextInt();
//
//        System.out.print("number first is : " + a + "\n number second is : " + b);
//        System.out.println("number first is : " + a);
//        System.out.println("number second is : " + b);


//        task two for the string

//        System.out.println("Enter your age : ");
//        int age = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter your name : ");
////        String name = sc.next();
//        String name = sc.nextLine();
//
//        System.out.println("Hello " + name + " you're " + age + " yers old");


//    task three for the character

        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        System.out.println("The character is : " + ch);
    }
}