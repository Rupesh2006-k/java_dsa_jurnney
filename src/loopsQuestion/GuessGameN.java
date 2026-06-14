package loopsQuestion;

import java.util.Scanner;

public class GuessGameN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1 - 100 : ");
        int randomNum = (int) (Math.floor(Math.random() * 100) + 1);
        int n = 0;
        do {
            n = sc.nextInt();

            if (randomNum > n) {
                System.out.println("Too less guess the higher number . " + randomNum);
            } else if (randomNum < n) {
                System.out.println("Too High , guess the lesser number " + randomNum);
            } else System.out.println("Congratulation you win the game " + randomNum);
        } while (n != randomNum);


    }

}
