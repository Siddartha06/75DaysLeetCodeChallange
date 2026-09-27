class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.sort(nums);
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        int j = 0;
        
        while (count < n) {
            int lastVal = -1; 
            boolean firstInRound = true;           
            for (int i = 0; i < n; i++) {
                if (!hs.contains(i)) {
                      if (firstInRound || nums[i] != lastVal) {
                        ans[j] = nums[i];
                        j++;
                        count++;
                        hs.add(i); 
                        lastVal = nums[i];
                        firstInRound = false;
                     }
                }
            }
        }
        return ans;
    }
}