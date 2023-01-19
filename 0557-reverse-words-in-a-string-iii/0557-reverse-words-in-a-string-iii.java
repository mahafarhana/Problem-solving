class Solution {
    public String reverseWords(String s) {
        
         String[] list=s.split(" ");
         String[] list2=new String[list.length] ;
        String v="";
       
        for(int i=0;i<list.length; i++){
             StringBuilder stb=new StringBuilder();
            stb.append(list[i]);
           stb.reverse();
            if(i==0){
                 v+=""+stb.toString();
            }else{
               v+=" "+stb.toString();
            }
          
        }
        System.out.println(v);
        return v;
    }
}