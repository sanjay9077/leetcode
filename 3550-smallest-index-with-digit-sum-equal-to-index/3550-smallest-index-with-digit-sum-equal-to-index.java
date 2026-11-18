class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int dig=0;
            while(nums[i]>0){
                dig+=nums[i]%10;
                nums[i]/=10;
            }
            if(dig==i) return i;
        }
        return -1;
    }
}