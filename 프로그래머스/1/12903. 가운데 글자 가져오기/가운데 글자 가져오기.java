class Solution {
    public String solution(String s) {
        int length = s.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            return "" + s.charAt(middle - 1) + s.charAt(middle);
        } else {
            return "" + s.charAt(middle);
        }
    }
}