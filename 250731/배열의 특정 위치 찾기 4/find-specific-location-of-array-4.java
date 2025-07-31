import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int sum = 0; 
        int[] arr = new int[10];
        
        for(int i =0; i<10; i++){
        int n = sc.nextInt();
        arr[i] = n;
        if(arr[i] == 0)break;
        if(arr[i]%2==0){
            cnt++;
            sum+=arr[i];
        }
        }
        System.out.print(cnt + " "+ sum);
    }
}