class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        fun(n,0,0,"",l);
        return l;
    }
    void fun(int n, int o, int c, String s,List<String> l){
        if(s.length()== 2*n){
            l.add(s);
            return;
        }
        if(c<o) fun(n,o,c+1, s+")", l);
        if(o<n) fun(n,o+1,c , s+"(", l);
    }
}