class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        d={
            "(":")",
            "[":"]",
            "{":"}",
        }
        
        if s[0] in d.values():
            return False
        
        i=0
        result=[]
        while(i<len(s)):
            if s[i] in d.keys():
                result.append(s[i])
            else:
                if len(result)!=0 and s[i]==d[result[-1]]:
                    result.pop()
                else:
                    return False
            i+=1
        return len(result)==0
