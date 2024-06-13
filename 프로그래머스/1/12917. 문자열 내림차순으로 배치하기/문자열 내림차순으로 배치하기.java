import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        
        Arrays.sort(charArray);
        
        StringBuilder sortedString = new StringBuilder(new String(charArray));
        
        return sortedString.reverse().toString();
    }
}
