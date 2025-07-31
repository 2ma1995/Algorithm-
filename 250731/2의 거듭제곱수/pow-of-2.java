import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(true){
            
            if(n%2==0){
                int result = n/2;
                System.out.print(result);
                break;
            }
        }
    }
}