class Solution {
    public int solution(int n) {
        String str = String.valueOf(n);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }

        return sum;
    }
}
