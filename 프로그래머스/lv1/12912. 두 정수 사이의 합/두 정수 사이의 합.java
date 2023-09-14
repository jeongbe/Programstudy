class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int sum = 0;
        int c = 0;
        
        if(a > b) {
        	c = b;   //c -> 3
        	System.out.println("c:"+ c);
        	b = a;   //b -> 5
        	a = c;  //a -> 3
        }
        System.out.println("a:"+ a);
    	System.out.println("b:"+ b);
        for(int i = a; i <= b; i++) {
        	
        		answer += i;
        	
        }
        System.out.println(answer);
        
        return answer;
    }
}