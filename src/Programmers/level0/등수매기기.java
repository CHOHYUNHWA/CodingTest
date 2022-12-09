package Programmers.level0;

public class 등수매기기 {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] sumScore = new int[score.length];
        for(int i = 0; i<score.length; i++) {
            sumScore[i] = score[i][0] + score[i][1];
            }
        for(int i = 0; i<sumScore.length; i++) {
            for(int j = 0; j<sumScore.length; j++) {
                if(sumScore[i] < sumScore[j]){
                    answer[i]++;
                }
            }
        }
        for(int i = 0; i< answer.length; i++) {
            answer[i]++;
        }
        return answer;
    }
}



//{60,70,80,90}

//4,3,2,1