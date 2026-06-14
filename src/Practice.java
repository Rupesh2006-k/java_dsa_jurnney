import java.util.Scanner;


/*

for loop :- is ko tab use karna hai jab aapko pata ho ki loop kaha se shuru ho raha hai aur kaha khatam karna hai tab for loop use hoga

while loop :- is ko tab use karna hai jab appko pata na ho ki loop kaha se start karna hai aur kab khatam hoga loop tab use hoga while loop



*/
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % n == 0) System.out.println(i);
        }
    }
}
