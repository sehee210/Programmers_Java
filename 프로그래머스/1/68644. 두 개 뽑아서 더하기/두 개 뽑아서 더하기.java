import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> sumSet = new HashSet<>();
        
        int index = numbers.length;
        
        for(int i=0; i<index; i++) {
            for(int j=i+1; j<index; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = sumSet.stream()
                             .sorted()
                             .mapToInt(Integer::intValue)
                             .toArray();
        
        return answer;
    }
}