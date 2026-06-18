package method;

public class StaticVSNonStatic {
    //non static method
    public void sayHello() {
        System.out.println("Hello");
    }

    // static method
    public static void sayBy() {
        System.out.println("ciao ciao");
    }

    public static void main(String[] args) {
//object createion
        StaticVSNonStatic st = new StaticVSNonStatic();
        st.sayHello();
        System.out.println("Hey");
        sayBy();
    }

}
