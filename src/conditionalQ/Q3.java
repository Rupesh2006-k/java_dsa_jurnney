package conditionalQ;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day name value");
        int day = sc.nextInt();


        // ✅ cyclic logic pehle apply karo
        day = day % 7;
        if (day == 0) day = 7;

        String dayname = "";

        if (day == 1) dayname = "Monday";
        else if (day == 2) dayname = "Tusday";
        else if (day == 3) dayname = "Wednessday";
        else if (day == 4) dayname = "Thursday";
        else if (day == 5) dayname = "Friday";
        else if (day == 6) dayname = "Saturday";
        else if (day == 7) dayname = "Sunday";
        else dayname = "Invalid day";
        System.out.println(dayname);

    }
}
