/*
1. Sum of two integers

Take two integers a & b with some constant values. Print their sum on
the console.
     Example :
       Input: a = 5 , b = 7
       Output: 12

 */

/*
public class concatination {

    public static void main() {
        int a = 5;
        int b = 7;
        System.out.println("the sum of a and b : " + (a + b));
    }
}*/

/*

 2. Sum & message
 Take two integers a & b with some constant values. Print their sum on
  the console with the appropriate message and values.
      Example :
      Input: a = 5 , b = 7
      Output: Sum of 5 & 7 is 12

 */
public class concatination {

    public static void main() {
//
        int a = 5;
        int b = 7;
        System.out.println(String.format("the sum of %d and %d : %d", a, b, a + b));
        System.out.println("the sum of " + a + " and " + b + " : " + (a + b));
    }
}

// 10"20