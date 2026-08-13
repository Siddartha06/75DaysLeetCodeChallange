class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int window_sum = nums[0] + nums[1];
        set.add(window_sum);

        for (int j = 1; j < nums.length - 1; j++) {
            int current_sum = window_sum - nums[j - 1] + nums[j + 1];

            if (set.contains(current_sum)) {
                return true;
            }
            set.add(current_sum);
            window_sum = current_sum;
        }
        return false;
    }
}