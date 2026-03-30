class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        i=0
        while(i<len(nums)):
            if(nums[i]==val):
                nums[i],nums[-1]=nums[-1],nums[i]
                nums.pop()
            else:
                i+=1
        return len(nums)

        