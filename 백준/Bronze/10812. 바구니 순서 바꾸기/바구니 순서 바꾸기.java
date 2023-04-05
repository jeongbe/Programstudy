import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 1번부터 N번까지의 바구니
        int M = scan.nextInt(); // 바구니 회전 횟수

        int[] Array = new int[N];  //처음 숫자 담을 배열 1,2,3,4,5,6,7,8,9,10
        int[] Array2 = new int[N];  // 회전된 바구니 숫자 담을 배열

        // 처음에 배열에 1,2,3,4,5,6,7,8,9,10 넣어주기
        for (int a = 0; a < N; a++) {
            Array[a] = a + 1;
        }

        //1에서 부터 바구니 회전 횟수 까지 (M)
        for (int b = 1; b <= M; b++) {
            //배열은 0부터 시작이니까 -1 씩 빼주고 시작
            int i = scan.nextInt() - 1; // 시작
            int j = scan.nextInt() - 1; // 끝
            int k = scan.nextInt() - 1; // 기준

            int start = i;  //밑에서 시작값이 필요함

            //바구니 회전해야할 개수가 j-i+1과 같음 
            for (int c = 0; c < j - i + 1; c++) {
                //k 에서 j 전까지를 Array2에 넣어줌
                if (k + c <= j) {
                    Array2[i + c] = Array[k + c];
                } else {//j뒤에서 부터 i 부터 k전까지 Array2에 넣어줌
                    Array2[c + i] = Array[start];
                    start++;
                }
            }

            //지금 Array2에 있는 배열 값 중 0이 아닌 것들은 회전된 바구니들
            //이기 때문에 이 부분만 그대로 Array배열에 다시 넣어줌
            //이렇게 하면 회전 부분에 들어가지 않은 부분은 그대로 Array에 있기
            //때문에 손상되지 않고 회전된 바구니 부분들만 들어감
            for (int d = 0; d < Array2.length; d++) {
                if (Array2[d] != 0) {
                    Array[d] = Array2[d];
                }
            }

        }
        //이후 출력
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }

    }
}