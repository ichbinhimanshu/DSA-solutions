class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x<0 or (x%10==0 and x!=0):
            return False
        else:
            rev=0
            while(x>rev):
                d=x%10
                rev=rev*10+d
                x=x//10
            if rev==x or x==rev//10:  #121 x=1 and rev=12 so use rev//10
                return True
            else:
                return False
        
