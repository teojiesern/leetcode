class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> R = new LinkedList<>();
        Queue<Integer> D = new LinkedList<>();
        for(int i=0; i<senate.length(); i++){
            if(senate.charAt(i) == 'R') R.offer(i);
            else D.offer(i);
        }
        while(!R.isEmpty() && !D.isEmpty()){
            int temp1 = R.poll();
            int temp2 = D.poll();
            if(temp1 < temp2) R.offer(temp1 + senate.length());
            else D.offer(temp2 + senate.length());
        }
        return R.isEmpty() ? "Dire" : "Radiant";
    }
}