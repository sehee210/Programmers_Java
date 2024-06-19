import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();
        int previous = arr[0];
        result.add(previous);
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != previous) {
                result.add(arr[i]);
                previous = arr[i];
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        
        return resultArray;
    }
}