class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        Arrays.sort(nums);
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        int j = 0;
        
        while (hs.size() < n) {    
            int lastCount = -1;      
            for (int i = 0; i < n; i++) {
              if(i == 0 && count==0){
                temp[j] = nums[i];
                lastCount = temp[j];
                j++;
                hs.add(i);
                count++;
              }
              if(count>0 && lastCount < nums[i] && !hs.contains(i)){
                temp[j] = nums[i];
                lastCount = temp[j];
                j++;
                hs.add(i);
                count++;

              }
            }

        }
        return temp;
    }
}