class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        
        
        while(true) {
        	
        	
        	//0제거
        	if(s.contains("0")) {
        		int length = s.length();
        		s = s.replaceAll("0","");
        		System.out.println(s.length());
        		
        		length = length - s.length();      		
        		answer[1] = answer[1] + length;
//        		length = s.length();
        	}
        	System.out.println(answer[1]);
        	//0제거 후 길이 2진수로 변환
        	s = Integer.toBinaryString(s.length());
        	System.out.println(s);
        	answer[0] += 1;
        	if(s.equals("1")) {
        		break;
        	}
        }
        
        //2진 반복 횟수
        System.out.println(answer[0]);
        
        //0을 몇번 제거했는지
        System.out.println(answer[1]);
        	
        
        return answer;
        
        
        
        
    }
}