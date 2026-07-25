import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> st = new Stack<>();
        for (int asteroid : asteroids) {
           boolean found= false;

            while (!st.isEmpty() && asteroid < 0 && st.peek() > 0) {
                if (st.peek() < -asteroid) {
                    st.pop();               
                } else if (st.peek() == -asteroid) {
                    st.pop();         
                    found = true;
                    break;
                } else {
                 found = true;         
                    break;
                }
            }
            if (!found) {
                st.push(asteroid);
            }
        }

        int[] arr = new int[st.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        return arr;
    }
}