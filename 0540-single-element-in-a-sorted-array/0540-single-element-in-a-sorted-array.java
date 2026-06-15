class Solution {
    public int singleNonDuplicate(int[] nums) {
        //brute force
        // for (int i = 0; i < nums.length - 1; i += 2) {
        //     if (nums[i] != nums[i + 1]) {
        //         return nums[i];
        //     }
        // }
        // return nums[nums.length - 1];

        //bit manipulation
        // int result=0;
        // for(int num:nums){
        //     result^=num;
        // }
        // return result;  

        //Binary Search
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }
        return nums[left];      
    }
}