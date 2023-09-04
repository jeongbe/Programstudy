
import java.util.Arrays;


class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int n = my_string.length();
        String[] Sarray = new String[n];
        int a = 0;
        String s = "";
        
        System.out.println(n);
        for(int i = 0; i < n; i++){
            Sarray[i] = my_string.substring(a, n);
            System.out.println(Sarray[i]);
            a++;
        }
        
        boolean found = Arrays.asList(Sarray).contains(is_suffix);;
        System.out.println(found);
    
        if(found == true){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}