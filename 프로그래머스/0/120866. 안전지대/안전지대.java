class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int [][] newBoard =  new int [n][n];
        
        for(int i=0; i<n; i++){          //행
            for(int j=0; j<n; j++){      //열
                if(board[i][j] == 1){
                    newBoard[i][j] = 1;
                    if (i > 0) newBoard[i - 1][j] = 1;
                    if (i < n - 1) newBoard[i + 1][j] = 1;
                    if (j < n - 1) newBoard[i][j + 1] = 1;
                    if (j > 0) newBoard[i][j - 1] = 1;
                    if (i > 0 && j > 0) newBoard[i - 1][j - 1] = 1;
                    if (i < n - 1 && j > 0) newBoard[i + 1][j - 1] = 1;
                    if (i > 0 && j < n - 1) newBoard[i - 1][j + 1] = 1;
                    if (i < n - 1 && j < n - 1) newBoard[i + 1][j + 1] = 1; 
                }
            }
        }
        
        for(int i=0; i<n; i++){          //행
            for(int j=0; j<n; j++){      //열
                if(newBoard[i][j] == 0){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}