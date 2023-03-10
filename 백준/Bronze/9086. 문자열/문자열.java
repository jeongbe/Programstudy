import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        String s = "";
        for (int i = 0; i < t; i++) {
            s = scan.next();

            int l = s.length();
            System.out.println(s.charAt(0) + "" + s.charAt(l - 1));
        }

    }
}