class Solution {
    public boolean isPalindrome(int x) {
          int reversed = 0, remainder, original;
     original=x;
    while (x>0) {
      
        remainder = x % 10;
        reversed = reversed * 10 + remainder;
        x /= 10;
    }
    if (original == reversed)
      return true;
    else
       return false;
    }
}