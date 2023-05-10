class Solution {
    public String reverseVowels(String s) {
       HashSet<Character> set = new HashSet<>();
       set.add('A');
       set.add('E');
       set.add('I');
       set.add('O');
       set.add('U');
       set.add('a');
       set.add('e');
       set.add('i');
       set.add('o');
       set.add('u');
       char charArr[] = s.toCharArray();
       int i=0, j=s.length()-1;
       while(i<j){
           if(!set.contains(charArr[i])){
               i++;
               continue;
           }
           if(!set.contains(charArr[j])){
               j--;
               continue;
           }
           char temp = charArr[i];
           charArr[i] = charArr[j];
           charArr[j] = temp;
           i++; 
           j--;
       }
       return new String(charArr);
    }
}