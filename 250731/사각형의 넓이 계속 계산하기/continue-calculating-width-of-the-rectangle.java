import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int width,height;
        char n;
        while(true){
            width = sc.nextInt();
            height = sc.nextInt();
            n = sc.next().charAt(0);
            System.out.println(width*height);
            if(n == 'C')break;
        }
    }
}