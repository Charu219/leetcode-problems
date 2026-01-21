class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            int val = nums.get(i);
            
            if (val % 2 == 0) {
                ans[i] = -1;
            } else {
                long t = (long) val + 1;
                
                long lowbit = t & -t;
                
                ans[i] = val - (int)(lowbit >> 1);
            }
        }
        
        return ans;
    }
}




Input: nums = [2,3,5,7]

Output: [-1,1,4,3]

