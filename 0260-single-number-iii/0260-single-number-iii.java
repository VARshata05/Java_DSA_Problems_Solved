class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=nums[i];
        }
        int mask=xor & (-xor);
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n;i++){
            if((nums[i] & mask)==0){
                xor2=xor2^nums[i];
            }
            else{
                xor1=xor1^nums[i];
            }
        }
        return new int[]{xor1,xor2};
    }
}