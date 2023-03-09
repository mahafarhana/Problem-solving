class Solution {
    public boolean checkString(String s) {
        char[] value=s.toCharArray();
       
        boolean type=true;
        for(int i=0;i<value.length-1;i++){
             String a = "" + value[i];
              String b = "" + value[i+1];
            if(a.equals("b") &&  b.equals("a")){
               return false;
            }
        }
        
        return type;
    }
}