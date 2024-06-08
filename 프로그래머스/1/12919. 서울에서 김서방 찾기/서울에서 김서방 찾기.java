class Solution {
    public String solution(String[] seoul) {
        int j = 0;
        
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                j = i;
                break;
            }
        }
        return "김서방은 " + j + "에 있다";
    }
}