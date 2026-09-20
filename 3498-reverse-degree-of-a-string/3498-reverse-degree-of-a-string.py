class Solution:
    def reverseDegree(self, s: str) -> int:
        str="Azyxwvutsrqponmlkjihgfedcba"
        res=[]
        count=0
        for i in s:
            count+=1
            if i in str:
                a=str.index(i)*count
                res.append(a)
        return sum(res)        
        