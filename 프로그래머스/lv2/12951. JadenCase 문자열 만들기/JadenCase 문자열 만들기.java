class Solution {
    public String solution(String s) {
        //공백으로 먼저 자른다.
        String[] strAry = s.split(" ");
        
        // String[] an = new String[strAry.length];
        
        String answer = "";
        //잘라서 배열에 넣는다.
        //첫문자가 알파벳인지 아닌지 확인한다.
            //아니면 그대로 출력 or 알파벳이면 맨 앞 부분만 알파벳으로 바꾼후 나머지는 소문자로 출력한다.
        
        
        
        for(int i = 0; i < strAry.length; i++){
      
                //공백나왔을때
                if(strAry[i].length() == 0){
                    answer += " ";
                }else{  
                    //앞이 소문자일때 대문자로하고 나머지 소문자
                    answer += strAry[i].substring(0,1).toUpperCase();
                    answer += strAry[i].substring(1).toLowerCase();
                    answer += " ";
                                    
                }
            
        }
        
        // 입력 받은 문자열의 맨 마지막이 " " 라면 바로 answer 반환
    	if(s.substring(s.length()-1, s.length()).equals(" ")){
    		return answer;
    	}
        answer = answer.trim();
        return answer;
    }
}