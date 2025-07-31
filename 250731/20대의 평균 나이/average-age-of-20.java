import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int age, sum=0, cnt=0;

        while(true){
            age = sc.nextInt();
            if(age<30 && age >=20){
                sum += age;
                cnt++;
                }else{
                System.out.printf("%.2f",(double)sum/cnt);                
                break;
                }
        }
    }
}