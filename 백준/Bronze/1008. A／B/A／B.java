import java.util.Scanner;

public class Main{
    public static void main(String arge[]){
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = a/b;
        
        System.out.println(c);
        
        scan.close();
    }
}