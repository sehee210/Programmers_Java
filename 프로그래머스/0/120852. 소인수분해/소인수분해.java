import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> factorsList = new ArrayList<>();

        for (int i = 2; i <= n; i++) {      //2부터 n까지 순회
            while (n % i == 0) {            //소인수가 중복으로 저장되지 않도록 검사
                if (!factorsList.contains(i)) {     //리스트에 소인수가 존재하지 않으면
                    factorsList.add(i);             //리스트에 소인수 저장
                }
                n /= i;     //남은 값 갱신
            }
        }

        // ArrayList를 배열로 변환
        int[] answer = new int[factorsList.size()];     //리스트 사이즈로 배열 생성
        for (int i = 0; i < factorsList.size(); i++) {
            answer[i] = factorsList.get(i);
        }

        return answer;
    }
}
