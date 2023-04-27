class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] a=new int[nums1.length+nums2.length];
         Double dividedValue = 0.0;
         Double finalValue=0.0;
        
        for(int i=0;i<nums1.length;i++){
              a[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){

           a[nums1.length+j]=nums2[j];
         
        }
        if(a.length>1){
         Arrays.sort(a);
         dividedValue=Double.valueOf(a.length)/2;
        if(Double.valueOf(a.length)%2==0){
             Double firstOne=dividedValue-1;
             int first=dividedValue.intValue();
            int b =(a[dividedValue.intValue()]+a[firstOne.intValue()]);
            finalValue=Double.valueOf(b)/2;
        }else{
            Double c =Math.floor(dividedValue); 
            int d=a[c.intValue()];
             finalValue=Double.valueOf(d);
        }
        }else{
            finalValue=Double.valueOf(a[0]);
            
        }
        return finalValue;
    }
}