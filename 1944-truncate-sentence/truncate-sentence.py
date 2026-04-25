class Solution(object):
    def truncateSentence(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        a=[]
        b=s.split()
        for i in range(0,k):
            a.append(b[i])
        return " ".join(a)