class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int multi=1;
        char[] a=(Integer.toString(n)).toCharArray();
        for(int i=0;i<a.length;i++){
           sum+=Integer.parseInt(String.valueOf(a[i]));
           multi*=Integer.parseInt(String.valueOf(a[i]));
        }
        
       int total=multi-sum;
        return total;
    }
}