class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int n=nums.length; 
        int cur_min=0,min_sum=nums[0]; 
        int max_sum=nums[0],cur_max=0; 
        for(int i=0;i<n;i++){ 
            cur_max=Math.max(nums[i],cur_max+nums[i]);
            max_sum=Math.max(cur_max,max_sum);

            cur_min=Math.min(nums[i],cur_min+nums[i]);
            min_sum=Math.min(cur_min,min_sum);
            total=total+nums[i];
        } 
        if(max_sum<0)
        return max_sum;
        return Math.max(max_sum,total-min_sum);
    }
}