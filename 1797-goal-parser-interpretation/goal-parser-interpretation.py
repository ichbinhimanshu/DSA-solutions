class Solution(object):
    def interpret(self, command):
        """
        :type command: str
        :rtype: str
        """
        dum=""
        i=0
        while(i<len(command)):
            if command[i]=="(" and command[i+1]==")":
                dum=dum+"o"
                i+=2
            elif command[i]=="(" and command[i+1]!=")":
                dum=dum+"al"
                i+=4
            else:
                dum=dum+"G"
                i+=1
        return dum
