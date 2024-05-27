class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int mid = total/num;
        int start = 0;
        
        if(num%2 == 0) {
            start = mid - (num/2) + 1;
        } else {
            start = mid - (num/2);
        }
        
        for(int i=0; i<num; i++) {
            answer[i] = start;
            start++;
        }
        
        return answer;
    }
}