class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                if(j==i)continue;
                for(int k=0;k<digits.length;k++){
                    if(k==i || k==j)continue;
                    int num=digits[i]*100+digits[j]*10+digits[k];
                    if(num>=100 && num%2==0)s.add(num);
                }
            }
        }
        return s.size();

    }
}