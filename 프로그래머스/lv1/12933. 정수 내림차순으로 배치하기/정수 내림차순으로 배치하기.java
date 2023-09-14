import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String ss = "";
        
        
        String[] s = String.valueOf(n).split("");
        Arrays.sort(s, Collections.reverseOrder());
   
        
        
        for(String st : s) {
        	ss += st;
        }
        
        answer = Long.parseLong(ss);
        System.out.println(answer);
        
        return answer;
    }
}