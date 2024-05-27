import java.util.HashMap;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        for(int number : numbers) {
            map.put(number, true);
        }
        
        for(int i=0; i<=9; i++) {
            if(!map.containsKey(i))
                answer += i;            
        }
        
        return answer;
    }
}