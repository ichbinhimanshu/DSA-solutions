class Solution(object):
    def longestPalindrome(self, s):
        d={}
        length=0
        for i in s:
            if i not in d:
                d[i]=1
            else:
                d[i]+=1
        for i in d:
            if d[i]%2==0:
                length+=d[i]
            elif d[i]%2!=0:
                length+=d[i]-1
                if length%2==0:
                    length+=1
        return length

                