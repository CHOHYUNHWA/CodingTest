package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OX퀴즈 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));
    }
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int answerInt = 0;
        List<String[]> quizList = new ArrayList<>();
        for(int i = 0; i < quiz.length; i++) {
            quizList.add(quiz[i].split(" "));
        }
        for(int i=0; i<quizList.size(); i++) {
                if (quizList.get(i)[1].equals("+")) {
                    answerInt = Integer.parseInt(quizList.get(i)[0]) + Integer.parseInt(quizList.get(i)[2]);
                    if(answerInt == Integer.parseInt(quizList.get(i)[4])){
                        answer[i] = "O";
                    }else {
                        answer[i] = "X";
                    }
                }
                if (quizList.get(i)[1].equals("-")) {
                    answerInt = Integer.parseInt(quizList.get(i)[0]) - Integer.parseInt(quizList.get(i)[2]);
                    if(answerInt == Integer.parseInt(quizList.get(i)[4])){
                        answer[i] = "O";
                    }else {
                        answer[i] = "X";
                    }
                }
        }
        return answer;
    }
}

