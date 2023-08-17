import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine()); // 단어 입력 횟수 Integer.parseInt-> 문자열을 정수로 바꿔줌
        int count = s; // count 자체를 단어 입력 횟수에서 시작에서 그룹단어가 아니면 -- 해나감

        for (int i = 0; i < s; i++) {
            boolean[] array = new boolean[26]; // bolean 자료형으로 배열을 만든다. 알파벳 개수 만큼
            String line = br.readLine(); // 단어 입력력

            for (int j = 0; j < line.length() - 1; j++) { // i +1 값과 비교하기때문에 -1 해줘야함 안해주면 문자 마지막 알파벳이 있지도 않은 값과 비교하려고 해서
                array[line.charAt(j) - 97] = true; // 들어온 charAt(j)값을 -97(a) 를 해서 배열에 ture값으로 넣어준다.
                if (line.charAt(j) != line.charAt(j + 1)) { // j 값과 j+1 값이 다를경우 밑에 if문을 탄다.
                    if (array[line.charAt(j + 1) - 97] == true) { // j 값과 j+1 값이 다르고 j+1값이 이미 들어와있는 값 즉 인덱스 값이 true일 경우
                        count--; // 단어 입력 횟수에서 -- 함 (그룹 단어가 아니니까)
                        break; // break 맨 처음 for문으로 이동해서 다음 단어 검사함
                    }
                }
            }

        }
        System.out.println(count);
    }
}
