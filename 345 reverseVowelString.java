class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> notVowels = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int mapIndex = 1, vCount = 0, notVCount = 0;
        String newString = "";
        for(int i = 0, j = 1; i<s.length(); i++){
            char charac = s.charAt(i);
            if(isVowel(charac)){
                vowels.add(charac);
                hm.put(j,i);
                j++;
            }else{
                notVowels.add(charac);
            }
        }
        Collections.reverse(vowels);
        for(int i = 0; i<s.length(); i++){
            boolean flag = hm.get(mapIndex) != null;
            if(flag && hm.get(mapIndex) == i){
                newString += vowels.get(vCount);
                vCount ++;
                mapIndex ++;
            }else{
                newString += notVowels.get(notVCount);
                notVCount++;
            }
        }
        return newString;
    }

    public static boolean isVowel(char s){
        if(Character.toLowerCase(s) == 'a' || Character.toLowerCase(s) == 'e' || Character.toLowerCase(s) == 'i' || Character.toLowerCase(s) == 'o' || Character.toLowerCase(s) == 'u'){
            return true;
        }else{
            return false;
        }
    }
}