class Solution {
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse))
            return true;
        else return false; 
        
    }
}