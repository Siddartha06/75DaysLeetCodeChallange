class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       Queue<Integer> q = new LinkedList<>();
       Stack<Integer> st = new Stack<>();
       int n = students.length;
       int m = sandwiches.length;
       for(int num : students){
        q.add(num);
       }
       for (int i =n-1;i>=0;i--){
        st.push(sandwiches[i]);
       }
       int k =0;
        while (k < q.size() ){
        if(q.peek()!= st.peek()){
            int top = q.poll();
            q.add(top);
            k++;
        }
        else {
            q.poll();
            st.pop();
            k=0;
        }
        
       }
      return q.size();
       
       
    }
}