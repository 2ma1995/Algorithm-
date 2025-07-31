import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean result = false;
        for(int i = 0; i<5; i++){
            int n = sc.nextInt();
            if(n%3==0){
                result = true;
            }else{
                result = false;
                break;
            }
        }
        if(result == true){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
        // Please write your code here.

    }
}