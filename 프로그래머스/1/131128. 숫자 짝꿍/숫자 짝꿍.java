import java.util.HashMap;

class Solution {
    public String solution(String X, String Y) {
        HashMap<Character, Integer> mapX = new HashMap<>();
        HashMap<Character, Integer> mapY = new HashMap<>();
        
        for (char c : X.toCharArray()) {
            mapX.put(c, mapX.getOrDefault(c, 0) + 1);
        }
        
        for (char c : Y.toCharArray()) {
            mapY.put(c, mapY.getOrDefault(c, 0) + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (char i = '9'; i >= '0'; i--) {
            if (mapX.containsKey(i) && mapY.containsKey(i)) {
                int count = Math.min(mapX.get(i), mapY.get(i));
                for (int j = 0; j < count; j++) {
                    sb.append(i);
                }
            }
        }
        
        // 공통된 숫자 없는 경우
        if (sb.length() == 0) {
            return "-1";
        }
        
        // 결과가 0으로만 구성된 경우
        if (sb.charAt(0) == '0') {
            return "0";
        }
        
        return sb.toString();
    }
}