class Solution:
    def isPalindrome(self, s: str) -> bool:
        s1=s.lower()
        em=""
        for i in s1:
            if i.isalnum():
                em+=i
        rev=em[::-1]
        if rev==em:
            return True
        else:
            return False