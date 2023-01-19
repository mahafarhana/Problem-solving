class Solution {
    public boolean detectCapitalUse(String word) {
        char[] c=word.toCharArray();
        int isUpperLetter=0;
         int isLowerLetter=0;
        for(int i=0;i<c.length;i++){
           if(Character.isUpperCase(c[i]) && Character.isUpperCase(c[0])) {
               isUpperLetter++;
           }else if(Character.isLowerCase(c[i])){
               isLowerLetter++;
           }
        }
        
        if(isUpperLetter==1 || c.length==isUpperLetter || c.length==isLowerLetter ){
            return true;
        }else{
          return false;  
        }
          
    }
}