import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0; // 0th fibonacci number
        int b = 1; // 1st fibonacci number

        if (n < 0) {
            System.out.println("N cannot be negative");
            return;
        }

        if (n == 0) System.out.println(a);
        else if (n == 1) System.out.println(b);
        else {
            int c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
        }
    }
}
