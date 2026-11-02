class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();
        for (char i : allowed.toCharArray()) {
            allowedSet.add(i);
        }

        int count = words.length;

        for (String word : words) {
            for (char i : word.toCharArray()) {
                if (!allowedSet.contains(i)) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}