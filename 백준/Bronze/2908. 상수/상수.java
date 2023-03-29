import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        String aa = Integer.toString(a);
        String t1 = new StringBuffer(aa).reverse().toString();
        int a1 = Integer.parseInt(t1);

        String bb = Integer.toString(b);
        String t2 = new StringBuffer(bb).reverse().toString();
        int b1 = Integer.parseInt(t2);

        if (a1 > b1) {
            System.out.println(a1);
        } else {
            System.out.println(b1);
        }
    }
}