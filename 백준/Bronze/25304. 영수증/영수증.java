import java.util.Scanner;

public class Main{
    public static void main(String arge[]){
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt(); // 영수증에 적힌 총 금액
        int n = scan.nextInt(); // 구매한 물견의 종류의 수
        int money = 0;
        int[] pr = new int[n];
        int[] num = new int[n];
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
          int a = scan.nextInt();
          int b = scan.nextInt();

          pr[i] = a;
          num[i] = b;

          answer[i] = pr[i] * num[i];
          money += answer[i];
        }

        if (x == money) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }

        scan.close();
    }
}