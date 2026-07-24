class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i=0;i<n;i++){
            char ch = s.charAt(i);

            if ((!st.isEmpty() && st.peek()!=ch) &&(Character.toUpperCase(ch) == Character.toUpperCase(st.peek()))){
                st.pop();
            
            }else {
                st.push(ch);
            }


        }StringBuilder str = new StringBuilder();
        for (char ans : st){
            str.append(ans);
        }

        return str.toString();

        
    }
}