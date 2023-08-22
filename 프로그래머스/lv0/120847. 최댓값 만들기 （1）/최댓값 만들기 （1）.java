class Solution {
    public int solution(int[] numbers) {
        
        int answer = 0;
        int max = 0;
        int min = 0;
        int a = 0;
        int length = numbers.length;
        
        for(int i = 0; i < length-1; i++){
          for(int j = i+1; j < length; j++){
              a = numbers[i] * numbers[j];
              System.out.println(a);
              if(max < a ){
                  max = a;
              }
              
              answer = max;
          }
        }
        
        return answer;
    }
}