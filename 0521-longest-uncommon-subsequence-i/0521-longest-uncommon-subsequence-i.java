class Solution {
    public int findLUSlength(String a, String b) {
if (a.length() != b.length()) {
            if (a.length() > b.length()) {
                return a.length();
            } else {
                return b.length();
            }
        }
        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(a.charAt(i)!= b.charAt(j) && i==j){
                  if(a.length()>b.length()){
                    return a.length();
                  }
                  else{
                    return b.length();
                  }
                }
            }
        }
        return -1;
    }
}