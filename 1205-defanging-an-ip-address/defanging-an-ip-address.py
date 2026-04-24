# class Solution(object):
#     def defangIPaddr(self, address):
#         """
#         :type address: str
#         :rtype: str
#         """
#         dum=""
#         for i in address:
#             if i==".":
#                 dum=dum+"[.]"
#             else:
#                 dum=dum+i
#         return dum
class Solution(object):
    def defangIPaddr(self, address):
        res = []
        for ch in address:
            if ch == ".":
                res.append("[.]")
            else:
                res.append(ch)
        return "".join(res)