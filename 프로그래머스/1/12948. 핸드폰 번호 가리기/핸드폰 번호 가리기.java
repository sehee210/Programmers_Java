class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int length = phone_number.length();
        
        for (int i=0; i<length-4; i++) {
            answer.append("*");
        }
        
        for (int i=length-4; i<length; i++) {
            answer.append(phone_number.charAt(i));
        }
        
        return answer.toString();
    }
}