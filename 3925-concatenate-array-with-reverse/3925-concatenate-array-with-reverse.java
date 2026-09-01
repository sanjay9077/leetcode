class Solution {
    public int[] concatWithReverse(int[] nums) {
        int num=nums.length;
        int ans[]=new int[2*num];
        for(int i=0;i<num;i++){
            ans[i]=nums[i];
            ans[i+num] = nums[num-i-1];
        }

        return ans;
    }
}
/*
 int num=nums.length;
        int ans[]=new int[2*num];
        for(int i=0;i<num;i++){
            ans[i]=nums[i];
            /*
        }
        int s=num;
        for(int i=num-1;i<=num;i--){
        ans[s]=nums[i];
        s++;
        }
       return ans;
        }
}
*/