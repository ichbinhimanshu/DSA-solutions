class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        # if needle in haystack:
        #     return haystack.index(needle)
        # else:
        #     return -1
        i=0
        n=len(needle)
        if haystack==needle:
            return 0
        while(i+n<len(haystack)+1):
            if haystack[i:i+n]==needle:
                return i
            else:
                i+=1
        return -1
