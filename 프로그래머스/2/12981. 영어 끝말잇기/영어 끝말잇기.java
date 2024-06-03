import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashSet<String> usedWords = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            if (usedWords.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }

            // 다음 단어의 시작이 이전 단어의 끝과 일치하지 않으면 종료
            if (i > 0 && words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            usedWords.add(words[i]);
        }

        return answer;
    }
}
