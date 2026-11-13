class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        for(int i=0;i<nums.length;i++){
            int in=1,d=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[j-1])in++;
                else break;
            }
            max=Math.max(max,in);
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[j-1])d++;
                else break;
            }
            max=Math.max(max,d);
        }
        return max;
    }
}