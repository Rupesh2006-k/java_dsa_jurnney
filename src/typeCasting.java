/*
Topic : TypeCasting
 */
public class typeCasting {

    public static void main(String[] args) {
        // byte < sort < int < long
        //   choti --> badi value  == implicit type conversion
        // badi --> choti  == explicit type conversion

        float b = 120.0f;
        int i = (int) b;

        System.out.println(i);
//        System.out.println((float) 9 / 2);
        char ch = 97;
//        System.out.println(ch);
    }
}
