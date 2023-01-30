class Solution {
    public int solution(int n) {
        int answer = 0;
        int x;
        
        for(int i = 1; i<= n; i++){
            if(i %2 ==0){
               answer = answer + i; 
            }
            
        }
        
        return answer;
    }
}