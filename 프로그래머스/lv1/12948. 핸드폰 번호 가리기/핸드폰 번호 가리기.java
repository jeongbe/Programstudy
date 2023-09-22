class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        //번호 뒤 4자리빼고 나머지 자리 수 만큼 answer에 *을 추가해준다.
        for(int i = 0; i < phone_number.length()-4; i++) {
        	answer += "*";
        }
        System.out.println(answer);
        
        //이후 anwer에 번호 뒤에서 4자리 부터 끝까지를 붙여준다.
        answer += phone_number.substring(phone_number.length()-4,phone_number.length());
        
        
        System.out.println(answer);
        return answer;
    }
}
