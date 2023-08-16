import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine(); // 입력받을 변수

        int length = s.length();
        int count = 0;

        for (int i = 0; i < length; i++) {

            if (s.charAt(i) == 'c' && i < length - 1) {
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                    i++;

                }
            } else if (s.charAt(i) == 'd' && i < length - 1) {
                if (s.charAt(i + 1) == '-') {
                    i++;

                } else if (s.charAt(i + 1) == 'z' && i < length - 2) {
                    if (s.charAt(i + 2) == '=') {
                        i += 2;

                    }
                }
            } else if ((s.charAt(i) == 'l' || s.charAt(i) == 'n') && i < length - 1) {
                if (s.charAt(i + 1) == 'j') {
                    i++;

                }
            } else if ((s.charAt(i) == 's' || s.charAt(i) == 'z') && i < length - 1) {
                if (s.charAt(i + 1) == '=') {
                    i++;

                }
            }
            count++;
        }

        System.out.println(count);

    }
}
