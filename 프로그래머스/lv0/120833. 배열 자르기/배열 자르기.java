class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int n = num2-num1+1;
        int[] answer = new int [n];
        int x = 0;
        
        for(int i = num1; i <= num2; i++){              
            answer[x] = numbers[i];
            x++;
            
        }
        
        return answer;
    }
}