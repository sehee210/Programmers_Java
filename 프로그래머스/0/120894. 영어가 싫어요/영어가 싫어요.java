import java.util.HashMap;
import java.util.Map;

class Solution {
    public long solution(String numbers) {
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);

        StringBuilder answer = new StringBuilder();

        int i = 0;
        while (i < numbers.length()) {
            for (String key : numberMap.keySet()) {
                if (numbers.startsWith(key, i)) {
                    answer.append(numberMap.get(key));
                    i += key.length();
                    break;
                }
            }
        }

        return Long.parseLong(answer.toString());
    }
}