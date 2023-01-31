class Solution {
    public int solution(int price) {
        double answer = 0;
        double subprice = 0;
        
        if(10<=price&& price<100000){
           answer= price;
       
          }else if(100000 <= price && price<300000){
            subprice = 0.05*price;
            answer = price-subprice;

        }else if(300000 <= price && price <500000  ){
             subprice = 0.10*price;
             answer = price-subprice;
         }else if(500000 <= price&& price <=1000000) {
             subprice = 0.20*price;
             answer = price-subprice;
         }
        
        
        return (int)answer;
    }
}