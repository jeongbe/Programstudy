import java.util.Scanner;

public class Main{
    public static void main(String arge[]){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        //총 분으로 바꾸기
        int min = (a * 60) + b;
        min = min + c;
        
         //시간이 24시간을 넘을 경우 24로 나눈 나머지를 hour에 넣는다
        int hour = (min / 60) % 24;
        min = min % 60;
        
        System.out.println(hour + " " + min);
        
        scan.close();
        
    }
}