class Solution {
    public int minMoves(int[] nums) {
        int n=0;
        for(int num:nums){
            if(num>n){
                n=num;
            }
        }
        int move=0;
        for(int num:nums){
            move+=(n-num);
        }
        return move;
    }
}