class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        x=sorted(strs,key=len)
        x1=x[0]
        for i in range(1,len(x)):
            res=x[i].startswith(x1)
            while res==False:
                x1=x1[:-1]
                res=x[i].startswith(x1)
        return x1

        
