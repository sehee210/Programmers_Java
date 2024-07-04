class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int half = food[i] / 2;
            for (int j = 0; j < half; j++) {
                left.append(i);
            }
        }

        right.append(left).reverse();
        left.append(0);
        left.append(right);

        return left.toString();
    }
}