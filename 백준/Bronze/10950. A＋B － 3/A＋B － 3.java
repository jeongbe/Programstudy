import java.util.Scanner;

public class Main{
    public static void main(String arge[]){
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        int a;
        int b;
        int[] answer = new int[t];
        
        for (int i = 0; i < t; i++) {
          a = scan.nextInt();
          b = scan.nextInt();
          int sum = a + b;
          answer[i] = sum;
        }
        for (int i = 0; i < t; i++) {
          System.out.println(answer[i]);
        }
        
    }
}