class Solution {
    public int[] solution(int num1, int denum1, int num2, int denum2) {
          int[] answer = new int[2];



        answer[1] = denum1 * denum2;
        answer[0] = (denum1*num2) + (denum2*num1);
        int min = Math.min(answer[0],answer[1]);
        int max = 1;
        for(int i=1; i<=min; i++){
            if(answer[0]%i==0 && answer[1]%i==0){
                max=i;
            }
    }
        answer[0] /= max;
        answer[1] /= max;

        return answer;
    }
}