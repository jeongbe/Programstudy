import java.util.Scanner;

public class Main{
    public static void main(String arge[]){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if(a > 0 && b > 0){
            System.out.println("1");
        }else if(a < 0 && b > 0){
            System.out.println("2");
        }else if(a < 0 && b < 0){
            System.out.println("3");
        }else{
            System.out.println("4");
        }
        
        scan.close();
    }
}