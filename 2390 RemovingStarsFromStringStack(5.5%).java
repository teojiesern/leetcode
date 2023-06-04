class Solution {
    public String removeStars(String s) {
        Stack<Character> ansStack = new Stack<>();
        String answer = "";
        int count = 0;
        for(int i=0; i<s.length(); i++){
            ansStack.push(s.charAt(i));
        }

        while(!ansStack.empty()){
            if(ansStack.peek() == '*'){
                ansStack.pop();
                count++;
            }else{
                if(count != 0){
                    ansStack.pop();
                    count--;
                }else{
                    answer = ansStack.pop() + answer;
                }
            }
        }
        return answer;
    }
}