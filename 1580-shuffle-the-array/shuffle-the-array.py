class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        dum1=[]
        dum2=[]
        for i in range(0,n):
            dum1.append(nums[i])
        for j in range(n,len(nums)):
            dum2.append(nums[j])
        
        res=[]
        for i in range(0,n):
            res.append(dum1[i])
            res.append(dum2[i])
        return res
        
