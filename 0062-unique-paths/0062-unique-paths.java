class Solution {
    public int uniquePaths(int m, int n) {
        int num[]=new int[n];
        num[0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j>0){
                num[j]+=num[j-1];
            }
        }
        }
        return num[n-1];
    }
}