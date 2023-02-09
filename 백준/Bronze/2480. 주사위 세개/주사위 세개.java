import java.util.Scanner;

public class Main{
    public static void main(String arge[]){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a == b && b == c) {
          System.out.println(10000 + a * 1000);
        } else if ((a == b && a != c) || (a != b && a == c) || (a != b && b == c)) {
          int num = 0;

          if (a == b) {
           num = a;
          } else if (a == c) {
            num = a;
          } else if (b == c) {
            num = b;
          }
          System.out.println(1000 + num * 100);
        } else if (a != b && a != c && b != c) {
          int max = 0;
          if ((a > b) && (a > c)) {
            max = a;
          } else if ((b > a) && (b > c)) {
            max = b;
          } else {
            max = c;
          }
          System.out.println(max * 100);
        }

        scan.close();
        
    }
}