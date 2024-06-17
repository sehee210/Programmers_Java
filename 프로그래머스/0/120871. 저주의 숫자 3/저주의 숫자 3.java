class Solution {
    public int solution(int n) {
        String number = "";
        int answer = 1;
        
        for(int i=1; i<=n; i++){
            while(answer%3==0 || String.valueOf(answer).contains("3")){
                answer++;
            }
            answer++;
        }
        
        return answer-1;
    }
}