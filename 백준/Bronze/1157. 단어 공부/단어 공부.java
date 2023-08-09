import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[26]; // 알파벳 갯수 26개이기 때문에 26
        String s = br.readLine(); // 입력받을 변수

        for (int i = 0; i < s.length(); i++) {
            // 대문자 범위
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                // 받은 문자 알파벳에서 - 65를 빼줌 예를 들면 B가 들어왔을때 66 - 65
                // 따라서 array[1]에 들어간다.
                array[s.charAt(i) - 'A']++; // 카운트 같은
            } else {// 소문자 범위
                // 마찬가지로 -97을 해준다.
                // 혹시나 해서 적는다. 지금문제에서는 대소문자 구분을 하지 않기 때문에
                // 97 - 97 즉 소문자 a가 들어와도 array[0]에 카운트 된다.
                array[s.charAt(i) - 'a']++;
            }
        }

        int max = 0;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (array[i] > max) {
                max = array[i];
                // 대문자로 출력해주기 위해서 i값에 다시 65들 더해준다. (위에 배열에 넣기 위해 -65를 함)
                // (char)로 형변환 해줘야함 알파벳 출력을 위해서
                ch = (char) (i + 65);
            } else if (max == array[i]) { // 저장된 max값과 배열에 있는 값이 같을때 ch에 ?를 저장
                ch = '?';
            }
        }
        System.out.println(ch);
    }

}
