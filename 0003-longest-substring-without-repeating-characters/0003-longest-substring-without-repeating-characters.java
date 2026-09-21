class Solution {
    public int lengthOfLongestSubstring(String s) {
        int fr[] = new int[256];
        int max = 0;
        int st = 0;
        for(int e=0;e<s.length();e++){
            char ch = s.charAt(e);
            fr[ch]++;
            while(fr[ch]>1){
                char ch2 = s.charAt(st++);
                fr[ch2]--;    
            }
             int size = e-st+1;
             max = Math.max(max,size);
        }
         return max;
    }
}