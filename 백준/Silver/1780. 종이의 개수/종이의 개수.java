import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	    static int N;
	    static int[][] ar;
	    static int[] ans= new int[3];
    
	public static void main(String[] args) throws NumberFormatException, IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		ar = new int[N][N];
		StringTokenizer stto;
		
		for (int i = 0; i < N; i++) {
			stto = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				ar[i][j]=Integer.parseInt(stto.nextToken());
			}
		}
		
		divide(0,0,N);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		System.out.println(ans[2]);
	}
	private static void divide(int x, int y, int n) {
		if(check(x,y,n)) {
			ans[ar[x][y]+1]++;
		}else {
			int tmp = n/3;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					divide(x+tmp*i, y+tmp*j, tmp);
				}
			}
		}
	}
	private static boolean check(int x, int y, int n) {
		int tmp = ar[x][y];
		for (int i = x; i < n+x; i++) {
			for (int j = y; j < y+n; j++) {
				if(tmp != ar[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}