class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        result=[]
        x=int("".join(map(str,digits)))
        x+=1
        for i in str(x):
            result.append(int(i))
        return result
