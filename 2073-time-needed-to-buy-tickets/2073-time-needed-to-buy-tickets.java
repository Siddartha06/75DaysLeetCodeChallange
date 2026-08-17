class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            q.add(i);
        }
          int t = 0;
         while (!q.isEmpty()) {
          int person = q.poll();
            tickets[person]--;
            t++;
             if (person == k && tickets[person] == 0) {
                return t;
            }
            if (tickets[person] > 0) {
                q.add(person);
            }
        }

        return t;
    }
}