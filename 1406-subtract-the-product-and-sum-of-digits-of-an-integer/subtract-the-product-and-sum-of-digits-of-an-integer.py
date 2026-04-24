class Solution(object):
    def subtractProductAndSum(self, n):
        """
        :type n: int
        :rtype: int
        """
        addi=0
        multi=1
        y=list(str(n))
        z=map(int,y)
        for i in z:
            addi=addi+i
            multi=multi*i
        return multi-addi