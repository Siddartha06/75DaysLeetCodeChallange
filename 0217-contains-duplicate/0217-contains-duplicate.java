class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums){
            hs.add(num);
        }
        if(hs.size()!= nums.length){
            return true;
        }
        return false;
    }
}