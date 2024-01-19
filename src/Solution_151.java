public class Solution_151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue").equals("blue is sky the"));
        System.out.println(reverseWords("  hello world  ").equals("world hello"));
        System.out.println(reverseWords("a good   example").equals("example good a"));
    }

    public static String reverseWords(String s) {
        String[] split = s.split(" +");
        var builder = new StringBuilder();
        for(int i = split.length - 1; i >= 0; i--) {
            if (!split[i].isEmpty()) {
                builder.append(split[i]);
                builder.append(" ");
            }
        }
        if (!builder.isEmpty()){
            builder.deleteCharAt(builder.length() - 1);
        }
        return builder.toString();
    }
}
