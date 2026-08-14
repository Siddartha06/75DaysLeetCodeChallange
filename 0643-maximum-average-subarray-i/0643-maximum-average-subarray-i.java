class Solution {
    public double findMaxAverage(int[] nums, int k) {
     int  n = nums.length;
     double currsum = 0;
     for (int i =0;i<k;i++){
        currsum += nums[i];

     }
     double ans = currsum/k;
      for (int i=k; i<n; i++) {
          currsum = currsum - nums[i - k] + nums[i];
          double avg = currsum / k;
           ans = Math.max(ans, avg);
        }

     return ans;
    }
}