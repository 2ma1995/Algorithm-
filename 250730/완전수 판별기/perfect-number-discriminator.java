import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = n; i > 0 ; i--){
            if(i!=n && n%i==0){
                sum+=i;
            }
        }
        if(sum == n){
            System.out.print("P");
        }else{
            System.out.print("N");
        }
        
    }
}