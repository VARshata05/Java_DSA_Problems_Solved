class Solution {
    public int minOperations(String s) {

        int changes = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) - '0' != i % 2) {
                changes++;
            }
        }

        return Math.min(changes, s.length() - changes);
    }
}