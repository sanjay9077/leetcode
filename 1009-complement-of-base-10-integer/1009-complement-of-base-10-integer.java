class Solution {
    public int bitwiseComplement(int n) {
         String sum=Integer.toBinaryString(n);
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