class Solution {
    public int solution(int[] array) {
        int count = 0;
        for (int num : array) {
            String numStr = String.valueOf(num);
            for (char c : numStr.toCharArray()) {
                if (c == '7') {
                    count++;
                }
            }
        }
        return count;
    }
}