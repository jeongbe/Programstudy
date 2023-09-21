class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < signs.length; i++) {
        	if(signs[i] == false) {
        		absolutes[i] = absolutes[i] * -1;
        	}
        }
        
        for(int i = 0; i < absolutes.length; i++) {
        	answer = answer + absolutes[i];
        }
        
//        for(int i = 0; i < absolutes.length; i++) {
//        	System.out.println(absolutes[i]);
//        }
//        
        System.out.println(answer);
        return answer;
    }
}