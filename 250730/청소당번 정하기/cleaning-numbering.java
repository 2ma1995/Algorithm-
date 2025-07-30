import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int classClean = 0;   // 2일마다 교실청소
        int hallClean = 0;    // 3일마다 복도청소
        int toiletClean = 0;  // 12일마다 화장실청소

        for (int day = 1; day <= n; day++) {
            if (day % 12 == 0) {
                toiletClean++;
            } else if (day % 3 == 0) {
                hallClean++;
            } else if (day % 2 == 0) {
                classClean++;
            }
        }

        System.out.println(classClean + " " + hallClean + " " + toiletClean);
        scanner.close();
    }
}
