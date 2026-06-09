class Solution {
    public int climbStairs(int n) {
       int dp[]=new int[n+1];
       dp[0]=1;
       dp[1]=1;
       for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
       } 
       return dp[n];
    //    if(n==1) return 1;
    //     if(n==2) return 2;
    //     int[] a=new int[n];
    //     a[0] =1;
    //     a[1]=2;
    //     for(int i=2;i<n;i++){
    //         a[i]=a[i-1]+a[i-2];
    //     }
    //     return a[n-1];
    }
}