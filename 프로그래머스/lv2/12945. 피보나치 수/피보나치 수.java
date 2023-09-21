class Solution {
    public int solution(int n) {
    	int answer = 0;
    	int[] intList = new int[n+1];
    	//배열 만들어서 0번째에 0 넣어주고 1번째에 1 넣어준다.
    	if(n == 0) {
    		answer = 0;
    	}
    	if(n == 1) {
    		answer = 1;
    	}
    	
    	intList[0] = 0;
    	intList[1] = 1;
    	
    	for(int i = 2; i <= n; i++) {
    		 intList[i] = (intList[i - 2] + intList[i - 1]) % 1234567;
//    		 System.out.println(intList[i]);
    	}
    	answer = intList[n] % 1234567 ;

        System.out.println(answer);
        return answer;
    }
}