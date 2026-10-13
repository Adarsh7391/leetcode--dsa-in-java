class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long score = 0;
        int n = nums.length;
        int mid = n/2;
        for(int i=0;i<mid;i++){
            score-=nums[i];
        }
        for(int i=mid;i<n;i++){
            score+=nums[i];
        }
        return score;
    }
}