class Solution {
    public int findComplement(int num) {
        String sum=Integer.toBinaryString(num);
        String s="";
        for(int i=0;i<sum.length();i++){
        if(sum.charAt(i)=='0'){
             s+='1';
        }else{
            s+='0';
        }
        }
          return Integer.parseInt(s,2);                       
        }
    }