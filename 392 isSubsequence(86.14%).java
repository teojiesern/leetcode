class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0, j=0;
        int sLength = s.length();
        int tLength = t.length();
        if(sLength == 0) return true;
        while(i<tLength){
            if(s.charAt(j) == t.charAt(i)) j++;
            if(j == sLength) return true;
            // only move forward for s if a match is found
            i++;
        }
        if(j == sLength) return true;
        return false;
    }
}