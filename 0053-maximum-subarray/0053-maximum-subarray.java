class Solution {
    public int maxSubArray(int[] nums) {
        // int n = nums.length; 
        // int ans = Integer.MIN_VALUE;
    //    for (int i =0;i<n;i++){
    //        for (int j =i;j<n;j++){
    //         int sum =0;
    //         for (int k = i;k<=j;k++){
    //             sum += nums[k];
    //         }                                   // using (n^3)
    //         ans = Math.max(ans,sum);

    //        }
    //     }
    //     return ans;
        

    // n^2 uis not working 
    //    for (int i =0;i<n;i++){
    //     int sum =0;
    //     for (int j =i;j<n;j++){
    //         sum += nums[j];
    //     }
    //     ans = Math.max(ans,sum);
    //    }
    //    return ans;



        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
        
    
