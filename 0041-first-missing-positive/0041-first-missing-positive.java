class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int ele : nums)
        set.add(ele);
        for(int i=1;i<nums.length+2;i++){
            if(!set.contains(i))
            return i;
        }
        return -1;
    }
}