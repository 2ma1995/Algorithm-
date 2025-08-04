import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int passStudent = 0;
        int[] score = new int[4];
        
        for(int j = 0; j < n; j++){
            int sum = 0;

            for(int i =0; i<score.length; i++){
                score[i] = sc.nextInt();
                sum+= score[i];
            }

            float avg = sum/(float)score.length;
            if(avg>=60){
                System.out.println("pass");
                passStudent++;
            }else{
                System.out.println("fail");
            }
        }
                System.out.println(passStudent);
    }
}