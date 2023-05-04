class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";
        int upperBound = findCD(str1.length(), str2.length());
        return str2.substring(0,upperBound);
    }

    public static int findCD(int p, int q){
        if(q == 0) return p;
        return findCD(q, p%q);
    }
}