class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                set.remove(i);
            }
            else{
                set.add(i);
            }
        }
            int ans = 0;
            for(int i:set){
                ans = i;
            }
        return ans;
    }
}