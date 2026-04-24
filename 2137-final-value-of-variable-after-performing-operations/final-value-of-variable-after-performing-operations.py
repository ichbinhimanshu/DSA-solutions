class Solution(object):
    def finalValueAfterOperations(self, operations):
        """
        :type operations: List[str]
        :rtype: int
        """
        final=0
        for i in operations:
            if i=="++X" or i=="X++":
                final+=1
            else:
                final-=1
        return final