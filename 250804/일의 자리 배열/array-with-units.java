import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 첫 번째 수
        int b = sc.nextInt(); // 두 번째 수

        int[] fib = new int[10];
        fib[0] = a;
        fib[1] = b;

        for (int i = 2; i < 10; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(fib[i]);
            if (i < 9) System.out.print(" ");
        }

        sc.close();
    }
}
