import java.util.ArrayList;

class Solution {
    public int[] solution(String s) {
        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {     //현재 위치 i
            boolean duplicate = false;

            for (int j = i - 1; j >= 0; j--) {      //앞에 나온 글자 위치 j
                if (s.charAt(i) == s.charAt(j)) {
                    answerList.add(i - j);
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {       //duplicate가 false이면 앞에 같은 글자가 없으니 -1
                answerList.add(-1);
            }
        }
        
        //리스트를 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}