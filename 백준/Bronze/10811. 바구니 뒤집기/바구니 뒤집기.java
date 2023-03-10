import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // 바구니 개수
        int m = scan.nextInt();
        int[] arr = new int[n];
        int k = 1;

        for (int a = 0; a < n; a++) {
            arr[a] = k;
            k++;
        }
        for (int b = 0; b < m; b++) {
            int i = scan.nextInt()-1;
            int j = scan.nextInt()-1;
            for (int d = i; d < j; d++) {
                int s = arr[i];
                arr[i++] = arr[j];
                arr[j--] = s;
            }
        }
        for (int c = 0; c < n; c++) {
            System.out.print(arr[c] + " ");
        }
        scan.close();
    }
}