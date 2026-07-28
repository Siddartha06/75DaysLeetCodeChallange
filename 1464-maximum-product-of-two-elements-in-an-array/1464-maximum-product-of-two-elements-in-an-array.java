class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = nums[n-1];
        int j = nums[n-2];
        int sum = (i-1) * (j-1);
        return sum;
       
        
    }
}