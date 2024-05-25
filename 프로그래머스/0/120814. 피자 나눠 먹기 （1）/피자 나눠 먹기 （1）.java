class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n<=7){	// 사람이 7명 이하일 경우
            answer = 1;     // 무조건 1판
        }
        else if(n%7 == 0){  // 사람이 7명씩 딱 나눠지는 경우
            answer = n/7;   // 필요한 피자 수
        }
        else {      // 사람이 7명보다 많고 7의 배수가 아닌 경우
            answer= (n/7) +1;   // 필요한 피자 수와 나머지를 위한 1판
        }
        return answer;
    }
}