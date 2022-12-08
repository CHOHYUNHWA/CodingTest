package Programmers;

public class 안전지대 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{
                {0,0,0,0,1},
                {0,1,0,1,0},
                {0,1,0,0,0},
                {0,0,1,0,0},
                {0,1,0,0,0}}));
    }
    public static int solution(int[][] board) {
        int answer = board.length* board.length;
        int[][] answerBoard = new int[board.length+2][board.length+2];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {

                if(board[i][j] != 0){
                    answerBoard[i+2][j+2]++;
                    answerBoard[i+2][j+1]++;
                    answerBoard[i+2][j+0]++;
                    answerBoard[i+1][j+2]++;
                    answerBoard[i+1][j+1]++;
                    answerBoard[i+1][j+0]++;
                    answerBoard[i+0][j+2]++;
                    answerBoard[i+0][j+1]++;
                    answerBoard[i+0][j+0]++;
                }
            }
        }
        for(int i = 0 ; i< answerBoard.length; i++){
            answerBoard[i][0] = 0;
            answerBoard[0][i] = 0;
            answerBoard[i][answerBoard.length-1] = 0;
            answerBoard[answerBoard.length-1][i] = 0;
        }
        for(int i = 0 ; i< answerBoard.length; i++){
            for(int j = 0 ; j< answerBoard.length; j++){
                if(answerBoard[i][j] != 0){
                    answer--;
                }
            }
        }
        return answer;
    }
}