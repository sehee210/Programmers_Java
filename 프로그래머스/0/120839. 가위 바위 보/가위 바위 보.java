class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        
        for(char s : rsp.toCharArray()) {
            if(s == '2')
                answer.append("0");
            else if(s == '0')
                answer.append("5");
            else
                answer.append("2");
        }
        
        return answer.toString();
    }
}