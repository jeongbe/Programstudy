class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] ch = my_string.split("");
        int[] intlist = new int[ch.length];

        for(int i = 0; i < ch.length; i++){
            int Num = my_string.charAt(i);
            intlist[i] = Num;
            System.out.println(intlist[i]);
            
            if((48 <= intlist[i]) && (intlist[i] < 58) ){
                answer += intlist[i] - 48;
            }
            
        }
        return answer;
        
    }
}