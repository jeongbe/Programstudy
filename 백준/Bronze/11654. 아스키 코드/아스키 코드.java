import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ch = scan.nextLine();
        int answer = ch.charAt(0);
        System.out.println(answer);

        scan.close();

    }
}