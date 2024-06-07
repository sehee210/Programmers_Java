import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        
        if(list.size() == 0)
            list.add(-1);
        
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}