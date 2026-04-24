class Solution(object):
    def countMatches(self, items, ruleKey, ruleValue):
        """
        :type items: List[List[str]]
        :type ruleKey: str
        :type ruleValue: str
        :rtype: int
        """
        if ruleKey=="type":
            x=0
        if ruleKey=="color":
            x=1
        if ruleKey=="name":
            x=2
        count=0
        for i in items:
            if i[x]==ruleValue:
                count+=1
        return count
            
        