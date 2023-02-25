import java.util.Scanner;

public class Main{

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(); //바구니 개수
    int m = scan.nextInt(); //1번부터 m번까지 공번호
    int[] arr = new int[n];

    for(int a = 0; a < m; a++) {
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();

        for(int b = i-1; b < j; b++) { // 배열 인덱스는 0부터라서 i-1을 해줌
            arr[b] = k;
        }
    }
    for(int c = 0; c < n; c++) {
        System.out.print(arr[c]+" ");
    }
     scan.close();
}
}