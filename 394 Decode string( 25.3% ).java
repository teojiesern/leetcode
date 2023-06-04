class Solution {
    public String decodeString(String s) {
        String result = "";
        Stack<String> resultStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        int index = 0;
        while(index < s.length()){
            if(Character.isDigit(s.charAt(index))){
                int number = 0;
                while(Character.isDigit(s.charAt(index))){
                    number = number * 10 + (s.charAt(index) - '0');
                    // this - '0' is to convert the character to integer of its value because without this subtract, it would give us back the ascii code instead
                    index++;
                }
                numStack.push(number);
            }else if(s.charAt(index) == '['){
                resultStack.push(result);
                result = "";
                index++;
            }else if(s.charAt(index) == ']'){
                StringBuilder sb = new StringBuilder(resultStack.pop());
                int occurences = numStack.pop();
                for(int i=0; i<occurences; i++){
                    sb.append(result);
                }
                result = sb.toString();
                index++;
            }else{
                result += s.charAt(index);
                index++;
            }
        }
        return result;
    }
}