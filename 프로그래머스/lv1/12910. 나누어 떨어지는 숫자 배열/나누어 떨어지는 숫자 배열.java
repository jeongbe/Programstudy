import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
    	int count = 0;

    	ArrayList<Integer> answer = new ArrayList<Integer>();
    	
    	for(int i = 0; i < arr.length; i++) {
    		//arr에 있는 값 하나하나 꺼내서 divisor랑 나눠서 떨어지는 값 answer에 넣기
    		if(arr[i] % divisor == 0) {
    			answer.add(arr[i]);
    			//카운트
    			count++;
    		}
    	}
    	//카운트 값이 0일때 divisor이랑 나눠지는 것이 없기때문에 -1을 넣어준ㄷ.
    	if(count < 1) {
    		answer.add(-1);
    	}
    	
    	Collections.sort(answer);
    	System.out.println(answer);

        return answer;
    }
}