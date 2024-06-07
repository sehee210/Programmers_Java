import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        return Arrays.stream(numlist)
                     .filter(a -> a % n == 0)
                     .toArray();
    }
}