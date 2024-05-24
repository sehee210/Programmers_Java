class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = numbers[0];
        int max2 = 0;
        
        for(int i=1; i<numbers.length; i++){
            if(numbers[i]>max){
                max2 = max;
                max = numbers[i];
            } else if(numbers[i]>max2) {
                max2 = numbers[i];
            }
        }
        answer = max * max2;
        return answer;
    }
}