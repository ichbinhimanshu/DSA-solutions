class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        sum=0
        z=[]
        for i in nums:
            sum=sum+i
            z.append(sum)
        return z
            