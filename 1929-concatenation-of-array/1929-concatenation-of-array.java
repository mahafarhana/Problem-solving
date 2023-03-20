class Solution {
    public int[] getConcatenation(int[] nums) {
              int[] value=new int[nums.length+nums.length];
        int count=0;
        do{
            count++;
        for(int i=0;i<nums.length;i++){
            if(count==1){
                value[nums.length+i]=nums[i];
            }else{
            value[i]=nums[i];
            }
       
        }
        }while(count<=1);
    
        return value;
    }
    
}