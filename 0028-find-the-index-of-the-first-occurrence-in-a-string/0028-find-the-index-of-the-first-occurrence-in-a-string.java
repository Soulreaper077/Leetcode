class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null || haystack.length() < needle.length()) {
            return -1;
        }

        if(needle.equals("")){
            return 0;
        }

      
        for(int currentIndex = 0; currentIndex < haystack.length() - needle.length() + 1; currentIndex++){
            if(haystack.charAt(currentIndex) == needle.charAt(0))
                
                if(haystack.substring(currentIndex, needle.length() + currentIndex).equals(needle))
                    // return the current index
                    return currentIndex;
        }

        // Otherwise return -1
        return -1;
        
    }
}