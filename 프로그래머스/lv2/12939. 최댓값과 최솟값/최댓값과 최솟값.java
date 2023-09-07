import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] stcut = s.split(" ");
        int[] stcutint = new int[stcut.length];      
        
        for(int i = 0; i < stcut.length; i++){            
            stcutint[i] = Integer.parseInt(stcut[i]);       
        }
        Arrays.sort(stcutint);
            
        System.out.println(stcutint[0]);
        System.out.println(stcutint[stcutint.length-1]);
       
        answer = stcutint[0] + " " + stcutint[stcutint.length-1];
        
        return answer;
    }
}