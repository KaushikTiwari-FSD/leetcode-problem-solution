class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length-1;
       int left = 0;
       int right = n;
      
       while(left<=right){
         int mid = left + (right - left)/2; // why mid is in loop ,cuz it also have to update,and also u r using mid pointer to find the target.
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid]<target){
                left = mid+1;
               }
               else{
               right = mid-1;
               }
       }
               return -1;
    }
}