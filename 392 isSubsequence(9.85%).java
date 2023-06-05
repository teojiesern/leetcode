class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() < 1) return true;
        Stack<Character> sStack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            sStack.push(s.charAt(i));
        }
        for(int i=t.length() - 1; i>=0; i--){
            if(sStack.isEmpty()) return true;
            if(t.charAt(i) == sStack.peek()) sStack.pop();
            if(sStack.isEmpty()) return true;
        }
        return false;
    }
}