class Solution {
    public String truncateSentence(String s, int k) {
        
        String[] value=s.split(" ");
        String v="";
       for(int i=0;i<k;i++){
           if(i==0){
               v+=value[i];
           }else{
                v+=" "+value[i];
           }
       }
       return v; 
    }
}