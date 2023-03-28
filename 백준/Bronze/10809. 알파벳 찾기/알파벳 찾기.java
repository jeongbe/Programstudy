
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String s = br.readLine();

        int[] arr = new int[26];

        Arrays.fill(arr, -1); // 26개 배열을 -1로 초기화 시키기

        for (int i = 0; i < s.length(); i++) {
            // 배열 값이 -1이 아닐때 이미 알파벳이 나왔기 때문에 continue사용
            if (arr[s.charAt(i) - 'a'] != -1) {
                continue;
            } else {
                arr[s.charAt(i) - 'a'] = i;
            }
        }

        //한칸씩 뛰우기
        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString());
    }
}