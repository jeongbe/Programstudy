class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int count = Integer.MIN_VALUE; //몇번 들어갔는지
        int mode = 0; //최빈값
        
        int[] indexarr = new int[100000];
        
        for(int i=0; i<array.length; i++){
            indexarr[array[i]]++;
        }
        for(int i=0; i<indexarr.length; i++){
            if(count < indexarr[i]){
                count = indexarr[i];
                mode = i;
            }else if (indexarr[i] == count) {
                mode = -1;
             } else if (array.length == 0) {
                 mode = array[0];
             }
            
        }
        answer = mode;
        
        return answer;
    }
}