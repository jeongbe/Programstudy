import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();
        scan.close();

        String t1 = new StringBuffer(a).reverse().toString();
        int a1 = Integer.parseInt(t1);

        String t2 = new StringBuffer(b).reverse().toString();
        int b1 = Integer.parseInt(t2);

        if (a1 > b1) {
            System.out.println(a1);
        } else {
            System.out.println(b1);
        }
    }
}