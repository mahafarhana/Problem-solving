class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count;
        int[] list=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]>nums[j]){
                    count++;
                }
            }
           
             list[i]= count;  
        }
        return list;
    }
}