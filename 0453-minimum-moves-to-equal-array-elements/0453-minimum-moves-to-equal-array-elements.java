class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int d=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]+d>nums[i-1]){
                sum+=d+nums[i]-nums[i-1];
                d+=nums[i]-nums[i-1];
            }
        }
        return sum;
    }
}