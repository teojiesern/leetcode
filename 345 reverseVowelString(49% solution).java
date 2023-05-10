class Solution {
    public String reverseVowels(String s) {
       int start = 0, end = s.length()-1;
       char charArr[] = s.toCharArray();
       String vowels = "aeiouAEIOU";
       while(start<end){
           while(start<end && !vowels.contains(charArr[start] + "")){
               start++;
           }

           while(start<end && !vowels.contains(charArr[end] + "")){
               end--;
           }

           char temp = charArr[start];
           charArr[start] = charArr[end];
           charArr[end] = temp;
           start++;
           end--;
       }
       return new String(charArr);
    }
}