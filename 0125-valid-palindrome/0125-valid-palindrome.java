class Solution {
    public boolean isPalindrome(String s) {
        boolean finalValue=false;
        String reverseValue="";
        String original=s.replaceAll("[^a-zA-Z^0-9]","").toLowerCase();
        char[] c=original.toCharArray();
        if(s.trim().equalsIgnoreCase("")){
            return true;
        }else if(c.length>0){
            // int i=c.length-1;
            //     do{
            //          reverseValue+=String.valueOf(c[i]);
            //         i--;
            //     }
            // while(i>=0);

            for(int i=c.length-1;i>=0;i--){
                
                 reverseValue+=String.valueOf(c[i]);
               
            }
        }
       
        if(original.equalsIgnoreCase(reverseValue)){
          finalValue=true;  
        }else{
             finalValue=false;  
        }
        
        return finalValue;
    }
}