package method;

public class Scope {
//    public class Counter {
//        static int count = 10;
//
//        static void showCount() {
//            System.out.println(count);
//        }
//    }
//
//    public class Demo {
//        int value = 100;
//
//        void show() {
//            int value = 50; // shadows instance variable
//            System.out.println(value);      // 50
//            System.out.println(this.value); // 100
//        }
//    }

    int value = 100;
    byte bt = 125;

    void show() {
        byte bt = 120;
        int value = 50;// shadowing
        System.out.println(value);// 50
        System.out.println(this.value);// 100
        System.out.println(this.bt); // 125 form the local variable scope
    }

    public static void main(String[] args) {

        Scope obj = new Scope();
        obj.show();
    }
}
