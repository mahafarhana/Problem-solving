class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int count=0,max=0;
        boolean missingPositiveValue=false;
        Set<Integer> s = new HashSet<Integer>();
         for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
                s.add(nums[i]);
        }
      
        for(int j=1;j<=max;j++){
              if(!s.contains(j)){
                 return j; 
              }
           
      //      missingPositiveValue=false;
//             if(j<max){
             
// //                 for (int k=0;k<nums.length;k++) {
// //                     if (j == nums[k]) {
// //                       missingPositiveValue=true;
                     
// //                     }
// //                 }
                
//                 if(!missingPositiveValue){
//                     return j;
//                 }
            
            }
            
        
        return max+1;
    }
}