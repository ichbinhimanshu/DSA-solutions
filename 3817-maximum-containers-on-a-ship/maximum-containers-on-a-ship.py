class Solution(object):
    def maxContainers(self, n, w, maxWeight):
        """
        :type n: int
        :type w: int
        :type maxWeight: int
        :rtype: int
        """
        x=n*n
        while True:
            if (x*w)<=maxWeight:
                return x
            else:
                return maxWeight//w