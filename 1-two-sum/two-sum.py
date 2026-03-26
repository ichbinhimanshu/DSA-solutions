class Solution(object):
    def twoSum(self, nums, target):
        # for i in range(len(nums)):                   #n
        #     need=target-nums[i]
        #     if need in nums and nums.index(need)!=i: #n
        #         return [i,nums.index(need)]          #total n^2

        
        
        #use dictonary to check O(1)
        d={}
        for i in range(len(nums)):
            d[nums[i]]=i
        for i in range(len(nums)):
            need = target - nums[i]
            if need in d.keys() and d[need]!=i:
                return [i,d[need]]


        