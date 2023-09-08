import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int[] reversAry = new int[B.length];

        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i < A.length; i++){
            
            answer += A[i] * B[B.length - i - 1];   
            
        }
        
        

        

        return answer;
    }
}