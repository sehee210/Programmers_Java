class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for(char a : my_string.toCharArray()) {
            if (Character.isUpperCase(a)) {
                answer.append(Character.toLowerCase(a));
            } else if (Character.isLowerCase(a)) {
                answer.append(Character.toUpperCase(a));
            }          
        }
        
        return answer.toString();
    }
}