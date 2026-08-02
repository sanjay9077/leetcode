class Solution {
    public int lengthOfLongestSubstring(String s) {
        int m=0;
        int maxlength=0;
         Set<Character> res=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(res.contains(s.charAt(i))){
              res.remove(s.charAt(m));
              m++;
            }
        res.add(s.charAt(i));
        maxlength=Math.max(maxlength,i-m+1);
        }
    return maxlength;
}
}