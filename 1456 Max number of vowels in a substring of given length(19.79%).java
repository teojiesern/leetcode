class Solution {
    public int maxVowels(String s, int k) {
        int count = 0, i=0, j=0, max = 0;
        while(i < s.length()){
            if(count == k) return k;
            count += checkVowel(s.charAt(i));
            if(i-j+1 == k){
                if(max < count) max = count;
                count -= checkVowel(s.charAt(j));
                j++;
            }
            i++;
        }
        return max;
    }

    public static int checkVowel(char input){
        String vowels = "aeiou";
        if(vowels.contains(Character.toString(input))) return 1;
        return 0;
    }
}