package method;

public class Parameters {
    public static void swap(int num1) {
        System.out.println(" num1 : " + num1);
    }

    public static void main(String[] args) {
        int a = 12;
        swap(a);
        System.out.println(a);
    }
}


//package method;
//
//public class Parameters {
//    public static void swap(int num1, int num2) {
//        int c = num1;
//        num1 = num2;
//        num2 = c;
//
//        System.out.println(" num1 : " + num1 + " num2 : " + num2);
//    }
//
//    public static void main(String[] args) {
//        int a = 12;
//        int b = 13;
//        swap(a, b);
//        System.out.println(a + "  &  " + b);
//    }
//}
