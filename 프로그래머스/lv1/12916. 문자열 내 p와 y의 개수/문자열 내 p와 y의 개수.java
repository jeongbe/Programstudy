class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String ss = s.toLowerCase();
        int Pcount = 0;
        int Ycount = 0;
        
        for(int i = 0; i < ss.length(); i++) {
        	if(ss.charAt(i) == 'p') {
        		Pcount++;
        	}else if(ss.charAt(i) == 'y') {
        		Ycount++;
        	}
                	
        }
        
        if(Pcount == Ycount) {
        	answer = true;
        }else {
        	answer = false;
        }

        System.out.println(answer);

        return answer;
    }
}