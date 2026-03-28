class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # i=0
        # while(i<len(nums)):
        #     j=i+1
        #     while(j<len(nums)):
        #         if nums[i]==nums[j]:
        #             nums.pop(j)
        #         else:
        #             j+=1
        #     i+=1
        # return len(nums)


        # x=list(set(nums))
        # y=sorted(x)
        # for i in range(len(x)):
        #     nums[i]=x[i]
        # return len(x)

        i=0
        j=1
        while(j<len(nums)):
            if(nums[i]!=nums[j]):
                i+=1
                nums[i]=nums[j]
            j+=1
        return i+1


                