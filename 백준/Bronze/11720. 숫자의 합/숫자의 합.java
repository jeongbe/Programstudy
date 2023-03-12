import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int c = scan.nextInt();
        String n = scan.next();
        int sum = 0;

        for (int i = 0; i < c; i++) {
            sum += n.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}