class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int ans=0;
        for(int i:nums)ans+=max-i;
        return ans;
    }
}