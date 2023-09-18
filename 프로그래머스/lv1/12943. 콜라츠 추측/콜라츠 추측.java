class Solution {
    public int solution(long num) {
        int answer = 0;
        long a = 0;
        
        
        
        
            while(num != 1) {
            	if(num % 2 != 0) {
            		num = (num * 3) + 1;
            		answer++;
            		continue;
            	}else if(num % 2 == 0) {
            		num = num /2;
            		answer++;
            		continue;
            	}
            }
            
        
        
       
        
        if(answer >= 500) {
         	answer = -1;
         	
         }
       
        
        System.out.println(answer);
        
        return answer;
    }
}