class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for (char a : my_string.toCharArray()) {
            if (Character.isDigit(a)) {
                answer += Character.getNumericValue(a);
            }
        }
        
        return answer;
    }
}
