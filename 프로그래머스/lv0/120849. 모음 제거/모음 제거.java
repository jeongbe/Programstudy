class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] Vowel =  {"a", "e","i","o","u"};
        
        for(int i = 0; i < Vowel.length; i++){
            if(my_string.contains(Vowel[i])){
                answer = my_string.replaceAll(Vowel[i], "");
                my_string = answer;
            }else{
                answer = my_string;
            }
        }
        
        
        
        return answer;
    }
}