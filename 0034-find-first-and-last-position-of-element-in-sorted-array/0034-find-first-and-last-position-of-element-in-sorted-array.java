class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a=new int[2];
        int firstValue=0;
     
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i]){
                firstValue++;
                if(firstValue==1){
                    a[0]=i;
                }else{
                     a[1]=i;
                }
               
            }
           
        }
         if(firstValue==1){
             a[1]=a[0];
         }
        if(nums.length<=0 || (a[0]<=0 && nums.length>0 && nums[0]!=target)){
            a[0]=-1;
            a[1]=-1;
        }
        return a;
    }
}