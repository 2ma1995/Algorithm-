import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
        int b = sc.nextInt();
            if(b%2!=0 && b%3==0){
                sum+=b;
            }
        }
        System.out.print(sum);
    }
}