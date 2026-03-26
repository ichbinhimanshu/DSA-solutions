import math
class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        n=x
        rev=0
        if x>=0:
            while(n!=0):
                d=n%10
                rev=rev*10+d
                n=n//10
        else:
            n=-x
            while(n!=0):
                d=n%10
                rev=rev*10+d
                n=n//10
            rev=-rev
        if(rev<=-2**31 or rev>=2**31-1):
            return 0
        else:
            return rev
        # if x>=0:
        #     rev=int(str(x)[::-1])
        # else:
        #     rev=-int(str(abs(x))[::-1])
        # if (rev < -2**31 or rev > 2**31 - 1):
        #     return 0
        # else:
        #     return rev
        
        