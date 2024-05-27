class Solution {
    public int solution(int n) {
        int i = 1; // 조건을 만족하는 변수
        int fac = 1;	// 팩토리얼 결과값을 담을 변수
        
        while(fac <= n){	//팩토리얼 값이 주어진 정수 n보다 크면 while문 종료
            i++;
            fac *= i;	// fac = fac * i; 팩토리얼 계산
        }
        
        return i-1;
    }
}