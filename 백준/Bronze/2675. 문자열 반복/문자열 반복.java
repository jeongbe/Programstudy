import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {

            int num1 = scan.nextInt();
            String s = scan.next();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < num1; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }

    }
}

