class Solution {
    public int maxProduct(int[] nums) {
        int n=0;
        int m=0;
       
       for(int i=0;i<nums.length;i++){
        if(nums[i]>n){
            m=n;
            n=nums[i];
        }
        else if(nums[i]>m){
           m= nums[i];
        }

       }
       return  (n-1) * (m-1);
    
    }
}