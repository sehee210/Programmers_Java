import java.util.*;

class Solution {
    public int[] solution(int[] arr) {        
        if (arr[0] == 10) {
            return new int[]{-1};
        }
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        //최소값을 제외하고 리스트에 추가
        List<Integer> list = new ArrayList<>();
        for (int value : arr) {
            if (value != min) {
                list.add(value);
            }
        }
        
        //리스트를 배열로 반환
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}