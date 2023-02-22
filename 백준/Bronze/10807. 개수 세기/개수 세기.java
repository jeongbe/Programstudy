import java.util.Scanner;

public class Main{
    public static void main(String arge[]){
        Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();
    int count = 0;
    int[] arr = new int[num];

    for (int i = 0; i < num; i++) {
        arr[i] = scan.nextInt();
    }

    int find = scan.nextInt();
    
    for (int i = 0; i < num; i++) {
        if (arr[i] == find) {
            count++;
        }
    }
     System.out.println(count);
    }
}