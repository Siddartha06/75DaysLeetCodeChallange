class Solution {
    public boolean findSubarrays(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int left = i;
            int right = i + 1;
            int sum = nums[left] + nums[right];

            while (right < nums.length - 1) {
                left++;
                right++;

                if (nums[left] + nums[right] == sum) {
                    return true;
                }
            }
        }
        return false;
    }
}