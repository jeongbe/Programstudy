import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.next();
        String text2 = "";


        StringBuffer sb = new StringBuffer(text);
        //문자열 뒤집음
        text2 = sb.reverse().toString();

        //문자열 비교할떄 equals 사용
        if (text.equals(text2)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}