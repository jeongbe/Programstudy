import java.util.Scanner;

public class Main{
    public static void main(String arge[]){
        Scanner scan = new Scanner(System.in);

    
        int a = scan.nextInt();
        String b = scan.next();

        System.out.println(a * (b.charAt(2) - '0'));
        System.out.println(a * (b.charAt(1) - '0'));
        System.out.println(a * (b.charAt(0) - '0'));

        System.out.println( a * Integer.parseInt(b));

        scan.close();
    }
}