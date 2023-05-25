class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> list = new ArrayList<>();
        backtrace(list, "", 0, 0, n);
        return list;
    }
    
    private void backtrace(List<String> list, String str, int start, int end, int max) {
        if(str.length() == max * 2) {
            list.add(str);
            return;
        }
        if(start < max) { // open parenthesis num is less than max
            backtrace(list, str+"(", start+1, end, max);
        }
        if(end < start) {// close parenthesis num is less than open num
            backtrace(list, str+")", start, end+1, max);
        }
    }
}