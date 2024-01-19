public class Solution_1768 {

    public static void main(String[] args) {
        assert mergeAlternately("abc", "pqr").equals("apbqcr");

    }

    public static String mergeAlternately(String word1, String word2) {
        var v1 = word1.toCharArray();
        var v2 = word2.toCharArray();
        var length = Math.max(word1.length(), word2.length());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i < word1.length()) {
                result.append(v1[i]);
            }
            if (i < word2.length()) {
                result.append(v2[i]);
            }
        }
        return result.toString();
    }
}
