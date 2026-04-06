class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        for i in range(len(nums1)):
            if i<m:
                continue
            else:
                nums1.pop()
        for i in range(len(nums2)):
            if i<n:
                continue
            else:
                nums2.pop()
        
        for i in nums2:
            nums1.append(i)

        return nums1.sort()


        