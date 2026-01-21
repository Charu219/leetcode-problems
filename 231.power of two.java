class Solution {
    public boolean isPowerOfTwo(int n) {
        if((n&(n-1))==0 && n>0){
            return true;
        }
        return false;
    }
}



Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
