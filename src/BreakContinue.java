public class BreakContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Break ");
//                break;
                continue;
            }
            System.out.println("hey : " + i);
        }
    }
}