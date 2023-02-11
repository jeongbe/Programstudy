import java.util.Scanner;

public class Main{
    public static void main(String arge[]){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
          for (int j = 1; j < n - i; j++) {
            System.out.print(" ");

          }
         for (int k = 1; k <= i + 1; k++) {
            System.out.print("*");
          }
          System.out.println();
        }
    }
}