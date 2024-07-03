class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a) {
            int newColas = (n / a) * b;
            answer += newColas;
            n = (n % a) + newColas;
        }
        
        return answer;
    }
}
