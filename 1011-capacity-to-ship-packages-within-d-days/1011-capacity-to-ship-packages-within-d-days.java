class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n= weights.length;
        int left=0,right=0;
        for(int w:weights){
            left=Math.max(left,w);
            right+=w;
        }
        while(left<right){
            int mid=(left+right)/2;
            int requiredDays=1;
            int curload=0;
            for(int w:weights){
                if(curload+w>mid){
                    requiredDays++;
                    curload=0;
                }
                curload+=w;

            }
            if(requiredDays>days){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
}