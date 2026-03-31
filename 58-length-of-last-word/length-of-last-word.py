class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        x=list(s.split(" "))
        y=[]
        for i in x:
            if i:
                y.append(i)
        return len(y[-1])
