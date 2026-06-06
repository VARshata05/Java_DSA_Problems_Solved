class Solution {
    public int maxProduct(int[] nums) {
        
        int min=nums[0],max=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
            int cur=nums[i];
            if(cur<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(cur,max*cur);
            min=Math.min(cur,min*cur);
            res=Math.max(res,max);
        }
        return res;

        // int max = nums[0];
        // int min = nums[0];
        // int result = nums[0];

        // for(int i = 1; i < nums.length; i++) {
        //     int curr = nums[i];

        //     if(curr < 0) {
        //         // swap max and min
        //         int temp = max;
        //         max = min;
        //         min = temp;
        //     }

        //     max = Math.max(curr, max * curr);
        //     min = Math.min(curr, min * curr);

        //     result = Math.max(result, max);
        // }

        // return result;
    }
}

