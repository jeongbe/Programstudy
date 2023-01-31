import java.util.Scanner;

public class Main{
    public static void main(String arge[]){
        
        Scanner scan = new Scanner(System.in);
        
        int chess[] = {1,1,2,2,2,8};
        
        for(int i = 0; i<6; i++){
            int me = scan.nextInt();
            int answer = chess[i] - me;
            System.out.print(answer + " ");
        }
        
        scan.close();

    }
}