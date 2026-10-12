class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1;
        int sum=0;
       while(n>0){
        int dig=0;
        dig=n%10;
            sum+=dig;
            pro*=dig;
            n=n/10;
           
        }
       return  pro-sum;
        }

    }
