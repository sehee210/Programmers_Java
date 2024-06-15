class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        String word = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                answer = answer * 10 + Character.getNumericValue(c);
            } else {
                word += c;

                for (int i = 0; i < words.length; i++) {
                    if (word.equals(words[i])) {
                        answer = answer * 10 + i;
                        word = "";
                    }
                }
            }
        }
        return answer;
    }
}
