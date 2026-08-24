class Solution {
    public int[] findDegrees(int[][] matrix) {
        int s=matrix.length;
        int ss[]=new int[s];
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(matrix[i][j]==matrix[j][i]){
                ss[i]+=matrix[i][j];
                }
            }
        }
         return ss;
        }
    }