import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || contains369(i)) {
                System.out.print("0");
            } else {
                System.out.print(i);
            }

            if (i < n) {
                System.out.print(" ");
            }
        }
    }

    public static boolean contains369(int num) {
        String s = Integer.toString(num);
        return s.contains("3") || s.contains("6") || s.contains("9");
    }
}
