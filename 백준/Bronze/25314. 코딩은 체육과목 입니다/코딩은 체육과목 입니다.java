import java.util.Scanner;

public class Main{
    public static void main(String arge[]){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int num1 = num / 4;

        String s = "long ";
        s = s.repeat(num1);

        System.out.println(s + "int");
    }
}