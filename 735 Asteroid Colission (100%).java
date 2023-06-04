class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int[] s = new int[asteroids.length];
        int top = -1;
        for (int a : asteroids) {
            // if there are asteroid that are going right, we add them into the array
            if (a > 0) s[++top] = a;
            else {
                // loop through each of the case where if we encounter an asteroid going left and the previous asteroid is going right, if the previous asteroid going right is smaller we would decrease the value of top up until the previous asteroid is an asteroid going left or if both the asteroid are of same size or the asteroid going left is smaller, if the asteroid going right is smaller, the top would persists and the next entry of asteroid would take over the position of the current smaller going left asteroid
                while (top > -1 && s[top] > 0 && s[top] < -a) top--;

                if (top == -1 || s[top] < 0) s[++top] = a;
                // if asteroid going left and right are of the same size, we would not add the asteroid going left into the array but instead we would decrease the top so that the next entry would overwrite this asteroid that exploded due to colission with the same size but opposite direction
                else if (s[top] == -a) top--;
            }
        }
        return Arrays.copyOf(s, top + 1);
    }
}