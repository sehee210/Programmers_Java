class Solution {
    public String solution(String my_string) {
        String vowels = "aeiou";
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (vowels.indexOf(c) == -1) {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
