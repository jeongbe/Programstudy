import java.util.Scanner;

public class Main{
    public static void main(String arge[]){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        
        scan.close();
    }
}