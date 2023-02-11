import java.util.Scanner;

public class Main{
    public static void main(String arge[]){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int answer = 0;
        
        for(int i = 1; i <=n; i++){
            answer = answer +i;
        }
        
        scan.close();
        System.out.println(answer);
        
    }
}