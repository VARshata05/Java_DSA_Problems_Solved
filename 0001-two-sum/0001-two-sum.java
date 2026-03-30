class Solution {
    public int[] twoSum(int[] nums, int tar) {
        // for(int i=0;i<nums.length-1;i++){
        //     for (int j=i+1;j<nums.length;j++){
        //         if((nums[i]+nums[j])==tar){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};
        Map<Integer,Integer> numMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int com=tar-nums[i];
            if(numMap.containsKey(com)){
                return new int[]{numMap.get(com),i};
            }
            numMap.put(nums[i],i);
        }
        return new int[]{};
    }
}