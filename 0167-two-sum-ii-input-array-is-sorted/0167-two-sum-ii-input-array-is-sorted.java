class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int l = 0;
        int r = n-1;
        int [] arr = new int [2];
        while (l < r && r < n){
            if (numbers[l] + numbers [r]== target){
                arr[0] = l+1;
                arr[1] = r+1;
                break;
             

            }
            else if (numbers[l] + numbers [r] > target){
                r--;
            }
            else {
                l++;
            }
           


        }
         return arr;
        
    }
}