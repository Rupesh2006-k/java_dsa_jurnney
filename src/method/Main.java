package method;

/*
TOPIC : Methods
*/
public class Main {
    // static - by name call kar paate hain
// non-static = pehle object create karna padega uske baad app use call karege whith the help of object variable name ( refrence)


    public void sayHello() {
        System.out.println("hello");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
//className  objVariable newKeyword className
        Main obj = new Main();
        obj.sayHello();

        System.out.println(sum(1, 1));
    }

}
