import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        // 입력이 null이 아닐때 까지 계속 반복
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

    }
}