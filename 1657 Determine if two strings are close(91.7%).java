class Solution {
    public boolean closeStrings(String word1, String word2) {
        // note that this question main solving mindset is that two strings are considered to be equal if they have
        // 1) the same length
        // 2) the same characters ( since we can easily change the sequence by using operation 1 )
        // 3) the same frequency distribution no matter the character ( since we can easily change the frequency by using operation 2 )
        // case 1
        if(word1.length() != word2.length()) return false;

        // case 2
        int w1[] = new int[26];    
        int w2[] = new int[26];    
        for(char c: word1.toCharArray()) w1[c - 'a']++;
        for (char c: word2.toCharArray()) w2[c - 'a']++;

        for(int i=0; i<w1.length; i++){
            if(w1[i] == 0 && w2[i] != 0 || w1[i] != 0 && w2[i] == 0) return false;
        }

        //case 3
        // contains key that represents the occurence of the character and the value which represents the frequency of the occurence
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: w1){
            if(i > 0){
                // increment the number of times the occurence appeared
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        for(int i: w2){
            if(i > 0){
                if(!map.containsKey(i)) return false;
                map.put(i, map.get(i) - 1);
                if(map.get(i) == 0) map.remove(i);
            }
        }

        // if map is empty, therefore we satisfy the third case
        return map.size() == 0;
    }
}