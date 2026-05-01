class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        d1={}
        for i in nums:
            if i not in d1:
                d1[i]=1
            else:
                d1[i]+=1
        for i in d1:
            if d1[i]>(len(nums)/2):
                return i