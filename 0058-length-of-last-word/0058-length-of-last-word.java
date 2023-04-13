class Solution {
    public int lengthOfLastWord(String s) {
       
        String[] value=s.split(" ");
        System.out.println(value[value.length-1].length());
       return value[value.length-1].length(); 
    }
}