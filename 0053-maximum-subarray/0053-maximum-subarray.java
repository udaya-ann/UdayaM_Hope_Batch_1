class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int currmax=0;
        for(int n: nums){
            currmax=Math.max(n,currmax+n);
            max=Math.max(max,currmax);
        }
        return max;
    }
}