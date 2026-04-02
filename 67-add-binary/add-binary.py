class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        f=int(a,2)
        s=int(b,2)
        addition=f+s
        x=bin(addition)
        return x[2:]