import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxNum = array[0];
        
        for(int i=1; i<array.length; i++) {
            if(maxNum < array[i]) {
                answer[1] = i;
                maxNum = array[i];
            }
        }
        
        answer[0] = maxNum;
        
        return answer;
    }
}