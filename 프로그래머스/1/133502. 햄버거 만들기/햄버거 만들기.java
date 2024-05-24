import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int ing : ingredient){
            stack.push(ing);
            
            if(stack.size() >= 4) {
                int fourth = stack.get(stack.size() - 4); //빵
                int third = stack.get(stack.size() - 3); //야채
                int second = stack.get(stack.size() - 2); //고기
                int first = stack.get(stack.size() - 1); //빵
                
                if(fourth == 1 && third == 2 && second == 3 && first == 1) {
                    answer++;
                    
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
            
        return answer;
    }
}