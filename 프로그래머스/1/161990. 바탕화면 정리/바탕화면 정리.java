class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for(int i=0; i<wallpaper.length; i++) {
            String paper = wallpaper[i];
            
            for(int j=0; j<paper.length(); j++) {
                if(paper.charAt(j) == '#') {
                    if (i < minX) minX = i;
                    if (j < minY) minY = j;
                    if (i > maxX) maxX = i;
                    if (j > maxY) maxY = j;
                }   
            }
        }
        
        answer[0] = minX;
        answer[1] = minY;
        answer[2] = maxX+1;
        answer[3] = maxY+1;
        
        return answer;
    }
}