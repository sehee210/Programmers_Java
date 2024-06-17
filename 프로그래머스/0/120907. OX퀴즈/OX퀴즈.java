class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++) {
            String now = quiz[i];
            String[] num = now.split("\\s");
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[2]);
            
            int ab = (num[1].equals("+")) ? a + b : a - b;
            
            answer[i] = (Integer.parseInt(num[4]) == ab) ? "O" : "X";
        }
        return answer;
    }
}