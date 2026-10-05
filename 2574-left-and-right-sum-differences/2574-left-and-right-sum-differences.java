class Solution {
    public int[] leftRightDifference(int[] nums) {
        int lsum=0;
        int r=nums.length;
        int res[]=new int[r];
        for(int i=0;i<r;i++){
         res[i]=lsum;
         lsum+=nums[i];
        }
        int sum=0;
        for(int i=r-1;i>=0;i--){
      res[i] = Math.abs(sum - res[i]);
            sum += nums[i];
        }
        return res;
    }
}
      