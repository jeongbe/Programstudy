import java.util.Arrays;
import java.util.Scanner;

public class Main{

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();
    int[] arr = new int[num];

    for (int i = 0; i < num; i++) {
        arr[i] = scan.nextInt();;        
    }
    Arrays.sort(arr);
    System.out.println(arr[0]);
    System.out.println(arr[arr.length-1]);

     scan.close();
}
}