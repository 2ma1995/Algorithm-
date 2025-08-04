import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int[] arr = new int[10];
        int sum = 0;
        int sum3 = 0;
        int sum3count = 0;
        float avg = 0f;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
            if(i%2!=0){
                sum+=arr[i];
            }
            if(i%3==2){
                sum3 += arr[i];
                sum3count++;
            }
        }
        avg = sum3/(float)sum3count;
        System.out.printf("%d %.1f",sum,avg);
    }
}