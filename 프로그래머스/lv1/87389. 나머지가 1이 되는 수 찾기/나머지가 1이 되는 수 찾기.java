import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> intArray =  new ArrayList<Integer>();
        
        for(int i = 1; i <= n; i++){
            
            if(n % i == 1){ 
                return i;                               
            }
        }
        
        
        return answer;
    }
}