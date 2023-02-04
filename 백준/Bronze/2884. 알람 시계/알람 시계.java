import java.util.Scanner;

public class Main{
    public static void main(String arge[]){
        Scanner scan = new Scanner(System.in);
        
        int time = scan.nextInt();
        int min = scan.nextInt();
        
        if(min < 45 && time != 0){
            time = time - 1;
            min = min - 45 + 60;
        }else if(min >= 45 && time ==0){
            min = min - 45;
        }else if(time == 0 && min < 45){
            time = 23;
            min = min - 45 + 60;
        }else if(time != 0 && min >= 45){
            min = min - 45;
        }

        System.out.println(time+" "+min);
        
        scan.close();
        
    }
}