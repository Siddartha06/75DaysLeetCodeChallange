class Solution {


    public int bs (int [] nums, int target , int low , int high){
        if(low > high){
            return -1;
        }
         int mid = low + (high - low )/2;
            if(nums[mid ]== target){
                return mid;
            }
            else if (nums[mid]< target){
                return bs(nums, target, mid+1,high);
            }                                           // Recursion 
            else {
                return bs(nums, target, low,mid-1);
            }
        
        
    }
    public int search(int[] nums, int target) {
         int n = nums.length-1;
        // int low = 0;
        // int high = n;
        // int ans =-1;
        // while (low <=high){
        //     int mid = low +(high-low)/2;
        //     if(nums[mid] == target){
        //        ans = mid;
        //        break;
                
        //     }else if (nums[mid]<target){
        //         low = mid+1;
        //     }
        //     else {
        //         high = mid-1;
        //     }

        // }
        // return ans;
      return  bs ( nums,target , 0 , n);




    }
}