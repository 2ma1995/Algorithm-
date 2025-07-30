import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int n = scanner.nextInt(); 
            if(n%2!=0){
                count++;
            }
        }
        System.out.print(count);
    }
}
