class Solution {
    public int reverseDegree(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
           int value ='z'-s.charAt(i)+1;
            count=count+value*(i+1);
           }
        
    return count;
}
}