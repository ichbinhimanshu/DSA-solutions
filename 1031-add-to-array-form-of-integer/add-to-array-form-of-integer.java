import java.math.BigInteger;
import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String emp = "";

        for (int i = 0; i < num.length; i++) {
            emp = emp + Integer.toString(num[i]);
        }

        BigInteger n = new BigInteger(emp);
        n = n.add(BigInteger.valueOf(k));

        String result = n.toString();

        List<Integer> x = new ArrayList<>();

        for (int i = 0; i < result.length(); i++) {
            x.add(Integer.parseInt(String.valueOf(result.charAt(i))));
        }

        return x;
    }
}