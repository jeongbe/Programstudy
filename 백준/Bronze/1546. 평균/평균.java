import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int max = 0;
        int total = 0;
        int score = 0;
        for (int i = 0; i < m; i++) {
            score = scan.nextInt();
            total += score;
            if (score > max) {
                max = score;
            }
        }
        double answer = 0;
        answer = 100.0 * total / max / m;

        System.out.printf("%.2f", answer);

        scan.close();
    }
}