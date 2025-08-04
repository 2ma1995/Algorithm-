import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[100];  
        int count = 0;

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            nums[count] = n;
            count++;
        }

        int sum = 0;
        
        for (int i = count - 1; i >= count - 3 && i >= 0; i--) {
            sum += nums[i];
        }

        System.out.println(sum);
        sc.close();
    }
}
