class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        x=[]
        for i in accounts:
            x.append(sum(i))
        return max(x) 