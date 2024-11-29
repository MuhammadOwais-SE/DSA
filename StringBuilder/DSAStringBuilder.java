package StringBuilder;


class DSAStringBuilder {

    public static boolean rotateString(String s, String target) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            // Move the leftmost character to the rightmost position
            char firstChar = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(firstChar);

            // Check if the rotated string matches the target
            if (sb.toString().equals(target)) {
                return true;
            }
        }
        return false;
    }
//  rotateString in O(n) time complexity
    // public boolean rotateString(String s, String goal) {
    //     if (s.length() != goal.length()) {
    //         return false;
    //     }
    //     return (s + s).contains(goal);
    // }
    public static void main(String[] args) {
            String s = "abcde";
            String target = "cdeab";
            System.out.print(rotateString(s, target));
    }
}