class Solution {
    public int maxArea(int[] heights) {
        int maxResult=Integer.MIN_VALUE;
       int i=0;
       int j=heights.length-1;
       while(i<j){
        int h=Math.min(heights[j],heights[i]);
        int w=j-i;
        maxResult=Math.max(h*w,maxResult);
        if(heights[i]<heights[j]){
           i++;
        }else if(heights[j]<heights[i]){
            j--;
        }else{
            i++;
        }
        
       }      
      
        return maxResult;
    }
}
