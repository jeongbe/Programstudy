import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet<Integer> array = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            array.add(scan.nextInt() % 42);
        }
        System.out.println(array.size());
        scan.close();
    }
}