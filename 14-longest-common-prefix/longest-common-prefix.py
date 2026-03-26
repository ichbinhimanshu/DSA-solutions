class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        x=sorted(strs,key=len)
        x1=x[0]
        for i in range(1,len(x)):
            while not x[i].startswith(x1):
                x1=x1[:-1]
        return x1

        
