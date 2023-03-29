import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        scan.close();

        // Stringtokenizer를 사용해서 공백기준으로 자른다.
        StringTokenizer tx = new StringTokenizer(text, " ");
        System.out.println(tx.countTokens());

    }
}