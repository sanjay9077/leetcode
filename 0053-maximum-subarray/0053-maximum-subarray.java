class Solution {
    public int maxSubArray(int[] nums) {
        int srimaximum=0;
        int sanmaximum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
              srimaximum=srimaximum+nums[i];
        if(srimaximum>sanmaximum){
            sanmaximum=srimaximum;
        }
        if(srimaximum<0){
            srimaximum=0;
        }
    }
    return sanmaximum;
}
}