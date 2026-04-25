class Solution(object):
    def largestAltitude(self, gain):
        """
        :type gain: List[int]
        :rtype: int
        """
        dum=[]
        alt=0
        for i in gain:
            dum.append(alt)
            alt=alt+i
            dum.append(alt)
        return max(dum)