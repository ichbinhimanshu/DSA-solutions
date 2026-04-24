class Solution(object):
    def numberOfMatches(self, n):
        """
        :type n: int
        :rtype: int
        """
        count=0
        x=n
        while x!=1:
            if x%2==0:
                x=x/2
                count=count+x
            else:
                x=(x-1)/2
                count=count+x+1
        return count

