class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] preFix=new int[nums.length];
        int [] sufFix=new int[nums.length];
        int [] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            preFix[i]=1;
            sufFix[i]=1;
        }
        for(int i=1;i<nums.length;i++){
            preFix[i]=preFix[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>-1;i--){
            sufFix[i]=sufFix[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            result[i]=preFix[i]*sufFix[i];
        }
        return result;
    }
}  
