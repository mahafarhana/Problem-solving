class Solution {
    public int maxArea(int[] height) {
        
     int leftSide=0;
        int rightSide=height.length-1;
        int max=0;
        while(leftSide<rightSide){
            int w=rightSide-leftSide;
            int h=Math.min(height[leftSide],height[rightSide]);
            int area =h*w;
            max=Math.max(max,area);
            if(height[leftSide] < height[rightSide]) leftSide++;
            else if(height[leftSide] > height[rightSide]) rightSide--;
            else {
                leftSide++;
                rightSide--;
            }
        }
      return max;  
      
         
    }
}