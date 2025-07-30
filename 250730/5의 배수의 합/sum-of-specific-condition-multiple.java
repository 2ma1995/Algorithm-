import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int start = a < b ? a : b;
        int end = a > b ? a : b;
        for(int i = start; i <= end; i++){
            if(i%5==0){
                sum += i;
            }
        }
        System.out.print(sum);
    }
}