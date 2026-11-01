class Solution {
    public int maxProfit(int[] prices) {
       int left=0;
       int right=1;
       int result=0;
       for(;right<prices.length;right++){
        if(prices[left]<prices[right]){
            int temp=prices[right]-prices[left];
            result=Math.max(temp,result);
        }else{
            left=right;
        }
       }
return result;
       }
}
