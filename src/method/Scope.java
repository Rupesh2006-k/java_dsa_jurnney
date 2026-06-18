package method;

public class Scope {
    static int c = 130;

    public static void globalScope() {
        System.out.println(c);
    }

    public static void main(String[] args) {
        int a = 12;
        globalScope();
        System.out.println(a);
    }

}
