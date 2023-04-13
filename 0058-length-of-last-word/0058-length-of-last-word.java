class Solution {
    public int lengthOfLastWord(String s) {
        String[] value=s.split(" ");
       return value[value.length-1].length(); 
    }
}