import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        int temp = 0;
        for(int i =1; i<=10; i++){
            sum*=i;
            temp = i;          
            if(sum>=n){  
                break;
            }
        }
        System.out.print(temp);
        // Please write your code here.
    }
}