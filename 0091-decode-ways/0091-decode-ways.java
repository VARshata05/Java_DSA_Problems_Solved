class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0)=='0'){
            return 0;
        }
        int n=s.length();
        int[] dp=new int[n+1];
        dp[0] = dp[1] = 1;
        for(int i=2;i<=n;i++){
            int one=s.charAt(i-1)-'0';
            int two=Integer.parseInt(s.substring(i - 2, i));
            if(one>=1){
                dp[i] += dp[i - 1];
            }
            if(two>=10 && two<=26){
                dp[i] += dp[i - 2];
            }
        } 
        return dp[n];
    }
}


//space optimized code

// class Solution {
//     public int numDecodings(String s) {
//         // Edge Case: If the string is empty or starts with '0', it cannot be decoded
//         if (s == null || s.length() == 0 || s.charAt(0) == '0') {
//             return 0;
//         }

//         int n = s.length();
        
//         // Base cases represented as variables to save space
//         int prev2 = 1; // Tracks decoding ways from 2 steps back
//         int prev1 = 1; // Tracks decoding ways from 1 step back
        
//         // Loop through the string starting from the second character
//         for (int i = 1; i < n; i++) {
//             int current = 0;
            
//             // 1. Check single-digit decoding
//             int singleDigit = s.charAt(i) - '0';
//             if (singleDigit >= 1 && singleDigit <= 9) {
//                 current += prev1;
//             }
            
//             // 2. Check two-digit decoding
//             int tensPlace = s.charAt(i - 1) - '0';
//             int combinedValue = (tensPlace * 10) + singleDigit;
//             if (combinedValue >= 10 && combinedValue <= 26) {
//                 current += prev2;
//             }
            
//             // If at any point the string becomes undecodable, break early
//             if (current == 0) {
//                 return 0;
//             }
            
//             // Shift the variables forward for the next iteration
//             prev2 = prev1;
//             prev1 = current;
//         }
//         return prev1;
//     }
// }