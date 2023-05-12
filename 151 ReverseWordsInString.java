class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String words[] = s.split(" +");
        String newString = "";
        for(int i= words.length-1; i>=0; i--){
            if(i != 0){
                newString += words[i] + " ";
            }else{
                newString += words[i];
            }
        }
        return newString;
    }
}