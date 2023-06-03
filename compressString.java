public static int compress(char[] chars) {
        HashMap<Character, Integer> charContainer = new HashMap<>();
        int tempCount = 0;
        String s = "";
        for(char c : chars){
            if(charContainer.containsKey(c)){
                tempCount++;
                charContainer.put(c, tempCount);
            }else{
                tempCount = 1;
                charContainer.put(c, tempCount);
            }
        }
        for(Character c : charContainer.keySet()){
            Integer value = charContainer.get(c);
            s += "" + c;
            if(value == 1){
            }else if(value > 10){
                while(value > 10){
                    s += "" + 1;
                    value -= 10;
                }
                s += "" + value;
            }else{
                s += value;
            }
        }
        System.out.println(s);
        return s.length();
    }