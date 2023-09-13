class Solution {
    public int[] solution(long n) {
        String St = Long.toString(n);
        String[] List = St.split("");
        int[] answer = new int[List.length]; 
        int a = 0;
        
        for(int i = List.length - 1 ; i >= 0 ; i--) {
        	answer[a] = Integer.parseInt(List[i]);
        	System.out.println(answer[a]);
        	a++;
        }
        
        return answer;
    }
}